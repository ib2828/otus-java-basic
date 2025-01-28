package ru.otus.java.basic.homeworks.homework3;

public class Application {
    public static void main(String[] args) {
        int[][] array1 = {{1, -1, 1}, {3, 1, -3}, {6, -3, 2}};
//        sumOfPositiveElements(array1);
        printSquare(4);
    }

    public static void sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void printSquare(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
