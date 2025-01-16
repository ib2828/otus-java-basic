package ru.otus.java.basic.homeworks.homework1;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Введите номер метода, который хотите запустить");
        Scanner scanner = new Scanner(System.in);
        int numberMethod = scanner.nextInt();
        switch (numberMethod) {
            case 1:
                System.out.println("Спасибо! Вы выбрали метод greetings");
                greetings();
                break;
            case 2:
                // такая конструкция сделана что бы получать отрицательные числа
                int a = (int) (Math.random() * 101) - (int) (Math.random() * 101);
                int b = (int) (Math.random() * 101) - (int) (Math.random() * 101);
                int c = (int) (Math.random() * 101) - (int) (Math.random() * 101);
                System.out.println("Спасибо! Вы выбрали метод checkSign");
                checkSign(a, b, c);
                break;
            case 3:
                System.out.println("Спасибо! Вы выбрали метод selectColor");
                selectColor();
                break;
            case 4:
                System.out.println("Спасибо! Вы выбрали метод compareNumbers");
                compareNumbers();
                break;
            case 5:
                System.out.println("Спасибо! Вы выбрали метод addOrSubtractAndPrint");
                int initValue = (int) (Math.random() * 101); // 0 to 100
                int delta = (int) (Math.random() * 101); // 0 to 100
                boolean increment = Math.random() < 0.5;
                addOrSubtractAndPrint(initValue, delta, increment);
                break;
            default:
                System.out.println("Спасибо! Вы выбрали несуществующий метод ");
                break;
        }
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
        int data = (int) (Math.random() * 21); // 0 to 20
        if (data <= 10) System.out.println("Красный");
        if (data > 10 && data <= 20) System.out.println("Желтый");
        if (data > 20) System.out.println("Зеленый");
    }

    public static void compareNumbers() {
        int a = (int) (Math.random() * 101) - (int) (Math.random() * 101);
        int b = (int) (Math.random() * 101) - (int) (Math.random() * 101);
        if (a >= b) System.out.println("a>=b");
        else System.out.println("a<b");
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) System.out.println(initValue + delta);
        else System.out.println(initValue - delta);
    }
}
