package ru.otus.java.basic.homeworks.homework8;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        int sizeArray = 3;
        String[][] array = {{"1", "1", "1"}, {"2", "2", "2"}, {"3", "e", "3"}};
        try {
            System.out.println(arrayProcessing(array, sizeArray));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("На вход функции передан некорректный массив");;
        }
    }

    public static int arrayProcessing(String[][] a, int size) {
        int s = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                try {
                    s += Integer.parseInt(a[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка преобразовании элемента в строке " + i + " столбце " + j);
                    return 0;
                }
            }
        }
        return s;

    }

}
