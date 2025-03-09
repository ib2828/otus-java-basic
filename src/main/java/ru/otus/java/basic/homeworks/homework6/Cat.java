package ru.otus.java.basic.homeworks.homework6;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    public void feed(Plate plate) {
        if (!plate.decreaseFood(appetite)) {
            return;
        }
        satiety = true;
    }

    public void info() {
        System.out.println("Кот " + name + (satiety ? " сыт" : " голоден"));
    }
}