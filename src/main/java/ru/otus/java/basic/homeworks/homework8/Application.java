package ru.otus.java.basic.homeworks.homework8;

public class Application {
    public static void main(String[] args) {
        int sizeArray = 3;
        String[][] array = {{"1", "1", "1"}, {"2", "2", "2"}, {"3", "0", "3"}};
        try {
            System.out.println(arrayProcessing(array, sizeArray));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("На вход функции передан некорректный массив");
        }
    }

    public static int arrayProcessing(String[][] a, int size) {
        int s = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                s += stringToInteger(a[i][j], i, j);
            }
        }
        return s;
    }

    public static int stringToInteger(String z, int row, int column)  throws AppArraySizeException{
        try {
            int a = Integer.parseInt(z);
            return a;
        } catch (AppArraySizeException e) {
            System.out.println("Ошибка преобразовании элемента в строке " + row + " столбце " + column);
            return 0;
        }
    }
}
