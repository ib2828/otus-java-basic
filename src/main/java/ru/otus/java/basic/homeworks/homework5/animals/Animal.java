package ru.otus.java.basic.homeworks.homework5.animals;

public abstract class Animal {
    protected String name;
    protected int speedRun;
    protected int stamina;
    protected int staminaOfRun;

    public float run(int distance, int speedRun) {
        return distance / speedRun;
    }

    public float swim(int distance, int speedSwim) {
        return distance / speedSwim;
    }

    public void info() {
        System.out.println("У " + name + " осталось " + this.stamina + " единиц выносливости");
    }
}
