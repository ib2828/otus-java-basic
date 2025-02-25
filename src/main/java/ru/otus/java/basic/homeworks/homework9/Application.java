package ru.otus.java.basic.homeworks.homework9;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println(filingList(1,20));
    }

    public static ArrayList filingList(int minValue, int maxValue){
        ArrayList<Integer> listLocal = new ArrayList<Integer>();

        for (int i = minValue; i < maxValue +1; i++) {
            listLocal.add(i);
        }
        return listLocal;
    }
}
