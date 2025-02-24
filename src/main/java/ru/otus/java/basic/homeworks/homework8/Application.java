package ru.otus.java.basic.homeworks.homework8;

public class Application {
    public static void main(String[] args) {
        int sizeArray = 4;
        String[][] array = {{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
        try {
            System.out.println(arrayProcessing(array, sizeArray));
        } catch (AppArraySizeException | AppArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int arrayProcessing(String[][] a, int size) throws AppArraySizeException, AppArrayDataException {
        if (a.length < size) {
            throw new AppArraySizeException("Неправильный размер массива");
        }
        int s = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                try {
                    s += Integer.parseInt(a[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException(String.format("Элемент: \"%s\" не удалось преобразовать в тип Integer в строке: %s колонке %s", a[i][j], i + 1, j + 1));
                }
            }
        }
        return s;
    }
}
