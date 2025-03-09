package ru.otus.java.basic.homeworks.homework6;

public class Plate {
    private final int maxFood;
    private int food;

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.food = maxFood;
    }

    public void addFood(int food) {
        if (food <= 0) {
            return;
        }
        if ((this.food + food) >= maxFood ) {
            this.food = maxFood;
            return;
        }
        this.food += food;
    }

    public boolean decreaseFood(int food) {
        if (food <= 0 || this.food - food < 0) {
            return false;
        }
        this.food -= food;
        return true;
    }

    public void info() {
        System.out.println("Вместимость тарелки: " + maxFood);
        System.out.println("Текущее количество еды на тарелке: " + food);
    }
}