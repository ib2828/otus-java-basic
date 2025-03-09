package ru.otus.java.basic.homeworks.homework6;

public class Application {
    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Барсик", 12),
                new Cat("Мурзик", 7),
                new Cat("Леопольд", 11),
                new Cat("Матроскин", 6)
        };

        Plate plate = new Plate(20);

        for (int i = 0; i < cats.length; i++) {
            cats[i].feed(plate);
            cats[i].info();
        }

        plate.addFood(10);
        plate.info();
        System.out.println();

    }
}
