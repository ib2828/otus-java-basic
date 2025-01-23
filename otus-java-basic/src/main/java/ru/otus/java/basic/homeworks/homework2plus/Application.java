package ru.otus.java.basic.homeworks.homework2plus;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {2, 2};
        int[] c = {1, 1, 1, 1, 1};
//        sumArray(a, b, c);
        int[] d = {1, 1, 1, 1, 1, 5};
//        pointArray(d);
        int[] e = {1, 2, 3, 4, 5};
//        checkSortArray(e);
        reverseArray(e);
    }

    public static void sumArray(int[] arr1, int[] arr2, int[] arr3) {
        int tempLength = Math.max(arr2.length, arr3.length);
        int maxLength = Math.max(arr1.length, tempLength);
        int[] resultArray = new int[maxLength];
        for (int i = 0; i < maxLength; i++) {
            if (i < arr1.length) {
                resultArray[i] = resultArray[i] + arr1[i];
            }
            if (i < arr2.length) {
                resultArray[i] = resultArray[i] + arr2[i];
            }
            if (i < arr3.length) {
                resultArray[i] = resultArray[i] + arr3[i];
            }
        }
        System.out.println(Arrays.toString(resultArray));
    }

    public static void pointArray(int[] arr) {
        int[] leftArray = new int[arr.length];
        int[] rightArray = new int[arr.length];
        boolean checkPoint = true;
        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(leftArray, 0);
            Arrays.fill(rightArray, 0);
            leftArray = Arrays.copyOfRange(arr, 0, arr.length - i - 1);
            rightArray = Arrays.copyOfRange(arr, arr.length - i - 1, arr.length);
            if (Arrays.stream(leftArray).sum() == Arrays.stream(rightArray).sum()) {
                System.out.println("Точка находится между элементами " + (arr.length - i - 1) + " и " + (arr.length - i));
                checkPoint = false;
                break;
            }

        }
        if (checkPoint) {
            System.out.println("В заданном массиве нету такой точки");
        }
    }
    public static void checkSortArray(int[] arr) {
        int[] tempArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(tempArray);
        if (Arrays.equals( arr, tempArray)) {
            System.out.println("Элементы массива идут по возрастанию");
        }
        else {
            System.out.println("Элементы массива не идут по возрастанию");
        }
    }
    public static void reverseArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
