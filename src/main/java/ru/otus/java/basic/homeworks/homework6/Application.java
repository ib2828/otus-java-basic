package ru.otus.java.basic.homeworks.homework6;

public class Application {
    public static void main(String[] args) {
        Plate plate = new Plate(10);
        Cat[] cats = {
                new Cat("Барсик", 5),
                new Cat("Мурзик", 3),
                new Cat("Леопольд", 6),
                new Cat("Матроскин", 5)
        };
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].setEat(plate.getCurrentAmountOfFood())) {
                plate.reducingFood(cats[i].getAppetite());
                cats[i].setSatiety(true);
            }

            if (cats[i].getSatiety()) {
                System.out.println("Кот " + cats[i].getName() + " сытый");
            } else {
                System.out.println("Кот " + cats[i].getName() + " голодный");
            }
        }
    }
}
