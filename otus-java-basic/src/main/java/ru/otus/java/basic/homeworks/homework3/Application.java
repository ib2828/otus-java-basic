package ru.otus.java.basic.homeworks.homework3;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        int[][] array1 = {{1, -1, 1}, {3, 1, -10}, {6, -3, 2}};
        int[][] array2 = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int[][] array3 = {{1, 1, 1}, {6, 5, 12}, {1, 1, 1}};

        int sumElements = sumOfPositiveElements(array1);
        System.out.println(sumElements);
        printSquare(4);
        setNullDiagonal(array2);
        int y = findMax(array1);
        System.out.println(y);
        int z = sumTwoStringArray(array3);
        System.out.println(z);
    }

    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    public static void printSquare(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void setNullDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 0;
        }
    }

    public static int findMax(int[][] array) {
        int result = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > result) {
                    result = array[i][j];
                }
            }
        }
        return result;
    }

    public static int sumTwoStringArray(int[][] array) {
        int result = 0;
        if (array.length > 1) {
            for (int i = 0; i < array[1].length; i++) {
                result += array[1][i];
            }
        } else {
            result = -1;
        }
        return result;
    }
}