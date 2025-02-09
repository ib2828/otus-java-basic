package ru.otus.java.basic.homeworks.homework5.animals;

public abstract class Animal {
    String name;
    int speedRun;
    int speedSwim;
    int stamina;
    int staminaOfRun;
    int staminaOfSwim;

    public float run(int distance, int speedRun) {
        return distance / speedRun;
    }

    public float swim(int distance, int speedSwim) {
        return distance / speedSwim;
    }
}
