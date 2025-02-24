package ru.otus.java.basic.homeworks.homework6;

public class Plate {
    private int maximumAmountOfFood;
    private int currentAmountOfFood;

    public Plate(int maximumAmountOfFood) {
        this.maximumAmountOfFood = maximumAmountOfFood;
        this.currentAmountOfFood = maximumAmountOfFood;
    }

    public void addFood(int foodSize) {
        if (this.currentAmountOfFood + foodSize < this.maximumAmountOfFood) {
            this.currentAmountOfFood += foodSize;
        } else {
            System.out.println("Указанное количество еды не поместиться в тарелку");
        }
    }

    public boolean foodAmount(int foodSize) {
        if (foodSize <= 0) {
            System.out.println("Количество еды указанно некорректно, оно должно быть положительным");
            return false;
        }
        if (this.currentAmountOfFood - foodSize >= 0) {
            this.currentAmountOfFood -= foodSize;
            return true;
        } else {
            return false;
        }
    }

    public int getCurrentAmountOfFood() {
        return this.currentAmountOfFood;
    }

}
