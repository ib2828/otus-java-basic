package ru.otus.java.basic.homeworks.homework6;

public class Plate {
    private int maximumAmountOfFood;
    private int currentAmountOfFood;

    public Plate(int maximumAmountOfFood) {
        this.maximumAmountOfFood = maximumAmountOfFood;
        this.currentAmountOfFood = maximumAmountOfFood;
    }

    public void putFootToPlate(int sizeFood) {
        if (this.currentAmountOfFood + sizeFood < this.maximumAmountOfFood) {
            this.currentAmountOfFood += sizeFood;
        } else {
            System.out.println("Указанное количество еды не поместиться в тарелку");
        }
    }

    public boolean reducingFood(int sizeFood) {
        if this.currentAmountOfFood - sizeFood >= 0) {
            this.currentAmountOfFood -= sizeFood;
            return true;
        } else {
            return false;
        }

        return ();
    }
}
