package ru.otus.java.basic.homeworks.homework1;

public class Application {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
//        greetings();
//        checkSign(a, b, c);
//        selectColor();
        compareNumbers();
    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        int result = a + b + c;
        if (result >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    public static void selectColor() {
        int data = 18;
        if (data <= 10 ) System.out.println("Красный");
        if (data > 10 && data <= 20) System.out.println("Желтый");
        if (data > 20) System.out.println("Зеленый");
    }

    public static void compareNumbers() {
        int a = 60;
        int b = 20;
        if (a >= b) System.out.println("a>=b");
        else System.out.println("a<b");
    }
}

