package ru.otus.java.basic.homeworks.homework22;

import java.util.Arrays;


public class Application {

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 1, 2, 3, 5, 8};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(createNewArrayAfterLastOne(array)));

        System.out.println(checkArray(new int[]{1, 2}));
        System.out.println(checkArray(new int[]{1, 1}));
        System.out.println(checkArray(new int[]{1, 3}));
        System.out.println(checkArray(new int[]{1, 2, 2, 1}));
    }

    public static int[] createNewArrayAfterLastOne(int[] array) throws RuntimeException {
        if (array == null) {
            return null;
        }

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 1) {
                return Arrays.copyOfRange(array, ++i, array.length);
            }
        }
        throw new RuntimeException();
    }

    public static boolean checkArray(int[] array) {
        if (array == null) {
            return false;
        }

        boolean existsOne = false;
        boolean existsTwo = false;

        for (int element : array) {
            if (element == 1) {
                existsOne = true;
            } else if (element == 2) {
                existsTwo = true;
            } else {
                return false;
            }
        }
        return existsOne && existsTwo;
    }
}