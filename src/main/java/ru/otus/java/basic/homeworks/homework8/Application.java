package ru.otus.java.basic.homeworks.homework8;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        String[][] array = {{"1", "a", "1"}, {"2", "2","2"}, {"3","3", "3"}};
        System.out.println(arrayProcessing(array));
    }

    public static int arrayProcessing(String[][] a) {
        int s = 0;
        try {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    try {
                        s += Integer.parseInt(a[i][j]);
                    } catch (NumberFormatException e){
                        System.out.println("Ошибка преобразовании элемента в строке " + i + " столбце " + j);
                    }
                }
            }
        return s;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка в размере массива");
            return 0;
        }
    }

}
