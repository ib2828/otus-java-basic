package ru.otus.java.basic.homeworks.homework6;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        if ( appetite > 0) {
            this.appetite = appetite;
        } else {
            this.appetite = 0;
            System.out.println("Вы передали некорректное значение аппетита (меньше нуля)");
        }
        this.satiety = false;
    }

    public void setSatiety(Boolean satiety) {
        this.satiety = satiety;
    }

    public boolean getSatiety() {
        return this.satiety;
    }

    public boolean setEat(int countEat) {
        if (countEat >= this.appetite){
            return true;
        } else {
            return false;
        }
    }
    public int getAppetite(){
        return this.appetite;
    }
    public String getName(){
        return this.name;
    }
}
