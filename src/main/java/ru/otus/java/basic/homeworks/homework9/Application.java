package ru.otus.java.basic.homeworks.homework9;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(3);
        elements.add(5);
        elements.add(7);
        elements.add(9);
        System.out.println("Array list последовательных элементов");
        System.out.println(filingList(1, 20));
        System.out.println("Сумма элементов, значение которых больше 5");
        System.out.println(sumElements(elements));
        System.out.println("Замена всех элементов одним числом");
        System.out.println(numberReplace(elements, 9));
        System.out.println("Замена всех элементов одним числом");
        System.out.println(numberIncrease(elements, 9));
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
            int a = (int) list.get(i);
            if ( a > 5) {
                s += a;
            }
        }
        return s;
    }
    public static ArrayList numberReplace(ArrayList list, int x) {
        for (int i =0; i < list.size(); i++) {
            list.set(i, x);
        }
        return list;
    }
    public static ArrayList numberIncrease(ArrayList list, int x) {
        for (int i =0; i < list.size(); i++) {
            int a = (int) list.get(i) + x;
            list.set(i, a);
        }
        return list;
    }
}
