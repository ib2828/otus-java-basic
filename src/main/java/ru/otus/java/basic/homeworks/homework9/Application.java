package ru.otus.java.basic.homeworks.homework9;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("3");
        list.add("6");
        list.add("5");
        list.add("5");
        list.add("10");
        System.out.println("Array list последовательных элементов");
        System.out.println(filingList(1, 20));
        System.out.println("Сумма элементов, значение которых больше 5");
        System.out.println(sumElements(list));
        System.out.println("Замена всех элементов одним числом");
        System.out.println(replaceNumber(list, 9));
    }

    public static ArrayList filingList(int minValue, int maxValue) {
        ArrayList<Integer> listLocal = new ArrayList();

        for (int i = minValue; i < maxValue + 1; i++) {
            listLocal.add(i);
        }
        return listLocal;
    }

    public static int sumElements(ArrayList list) {
        int s = 0;
        for (int i =0; i < list.size(); i++) {
            int a = Integer.parseInt((String) list.get(i));
            if ( a > 5) {
                s += a;
            }
        }
        return s;
    }
    public static ArrayList replaceNumber(ArrayList list, int x) {
        for (int i =0; i < list.size(); i++) {
            list.set(i, Integer.toString(x));
        }
        return list;
    }
}
