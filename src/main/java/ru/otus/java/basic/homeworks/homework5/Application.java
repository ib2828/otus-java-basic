package ru.otus.java.basic.homeworks.homework5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int staminaCat = 100;
        int staminaDog = 100;
        int staminaHorse = 100;
        Scanner scanner = new Scanner(System.in);

        boolean nextLoop = true;
        int numberAction = 0;

        Cat cat = new Cat("Barsik", 10, staminaCat);
        Dog dog = new Dog("Tuzik", 10, 2, staminaDog);
        Horse horse = new Horse("Wind", 10, 3, staminaHorse);

        do {
            System.out.println("");
            System.out.println("Введите номер необходимого животного");
            System.out.println("1 Кот Barsik");
            System.out.println("2 Собака Tuzik");
            System.out.println("3 Лошадь Wind");
            System.out.println("0 Для выхода из программы");
            System.out.println("");
            int numberAnimal = scanner.nextInt();
            switch (numberAnimal) {
                case 1:
                    System.out.println("Информация о коте");
                    int catMethod = cat.getAction();
                    if (catMethod == 1) {
                        System.out.println("Кот побежал");
                    }
                    if (catMethod == 2) {
                        System.out.println("Кот не умеет плавать");
                    }
                    if (catMethod == 3) {
                        cat.info();
                    }

                    break;
                case 2:
                    System.out.println("Информация о собаке");
                    dog.info();
                    break;
                case 3:
                    System.out.println("Информация о лошади");
                    horse.info();
                    break;
                case 0:
                    System.out.println("Спасибо! Вы закончили работу");
                    nextLoop = false;
                    break;
                default:
                    System.out.println("Вы выбрали несуществующее животное ");
                    break;
            }
        } while (nextLoop);

    }


    public void actionAnimal() {
        System.out.println();
    }
}
