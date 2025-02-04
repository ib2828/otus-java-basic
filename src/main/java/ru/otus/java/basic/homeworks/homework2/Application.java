package ru.otus.java.basic.homeworks.homework2;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        String word = "Hello World";
        int countPrintLine = 5;
        int a = 5;
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array3 = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        System.out.println("Вызов метода printLine");
        printLine(word, countPrintLine);
        System.out.println("");
        System.out.println("Вызов метода summElementArray");
        summElementArray(array2);
        System.out.println("");
        System.out.println("Вызов метода fillingArrayElemetns");
        fillingArrayElemetns(a, array3);
        System.out.println("");
        System.out.println("Вызов метода increaseElementArray");
        increaseElementArray(a, array2);
        System.out.println("Вызов метода summHalfArry");
        summHalfArry(array2);
    }

    //
    public static void printLine(String word, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }

    public static void summElementArray(int[] arr1) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 5) {
                sum += arr1[i];
            }
        }
        System.out.println("Сумма всех элементов, значение которых больше 5 равно " + sum);
    }

    public static void fillingArrayElemetns(int a, int[] arr1) {
        System.out.println("Исходный массив " + Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = a;
        }
        System.out.println("Преобразованный массив " + Arrays.toString(arr1));
    }

    public static void increaseElementArray(int a, int[] arr1) {
        System.out.println("Исходный массив " + Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr1[i] + a;
        }
        System.out.println("Преобразованный массив " + Arrays.toString(arr1));
    }

    public static void summHalfArry(int[] arr1) {
        int sumLeft = 0;
        int sumRight = 0;
        int halfLength = arr1.length / 2;
        int fullLength = arr1.length;
        for (int i = 0; i < halfLength; i++) {
            sumLeft += arr1[i];
            sumRight += arr1[fullLength - i - 1];
        }
        if (sumLeft > sumRight) System.out.println("Сумма элементов левой половины массива " + sumLeft);
        else System.out.println("Сумма элементов правой половины массива " + sumRight);
    }
}
