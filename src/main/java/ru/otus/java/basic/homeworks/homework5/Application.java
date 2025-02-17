package ru.otus.java.basic.homeworks.homework5;

import ru.otus.java.basic.homeworks.homework5.animals.Animal;
import java.util.Scanner;

public class Application {
    private static Cat cat = new Cat("Barsik", 10, 20);
    private static Dog dog = new Dog("Tuzik", 10, 2, 30);
    private static Horse horse = new Horse("Wind", 10, 3, 40);

    public static void main(String[] args) {
        Animal currentAnimal;
        currentAnimal = getAnimalByNumber();
        if (currentAnimal == null) {
            System.out.println("Вы выбрали несуществующее животное");
            System.exit(0);
        }
        ;
        getAnimalAction(currentAnimal);
    }

    public static Animal getAnimalByNumber() {
        Scanner scannerAnimal = new Scanner(System.in);
        System.out.println("Выберите животное");
        System.out.println("1 Кот");
        System.out.println("2 Собака");
        System.out.println("3 Лошадь");
        int choiceAnimal = scannerAnimal.nextInt();
        return switch (choiceAnimal) {
            case 1 -> cat;
            case 2 -> dog;
            case 3 -> horse;
            default -> null;
        };
    }

    public static void getAnimalAction(Animal animal) {
        Scanner scannerAction = new Scanner(System.in);
        int distance1;
        System.out.println("Выберите действие");
        System.out.println("1 Бег");
        System.out.println("2 Плавание");
        System.out.println("3 Информация");
        int action = scannerAction.nextInt();
        switch (action) {
            case 1 -> {
                    distance1 = getDistance();
                    System.out.println("Бег");
                    System.out.println("Бег");
                    System.out.println("Бег" + distance1);
            }
            case 2 -> {
                    if ( animal == cat ){
                        animal.swim(0);
                    } else {
                        distance1 = getDistance();
                        System.out.println("Плавание" + distance1);
                    }
            }
            case 3 -> animal.info();
            default -> System.out.println("Выбрали неправильное действие");

        }
    }
    public static int getDistance() {
        Scanner scannerDistance = new Scanner(System.in);
        System.out.println("Введите дистанцию");
        int distance = scannerDistance.nextInt();
        return distance;
    }
}


