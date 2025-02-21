package ru.otus.java.basic.homeworks.homework6;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
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
