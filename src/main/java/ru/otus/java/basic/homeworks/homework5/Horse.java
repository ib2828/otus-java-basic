package ru.otus.java.basic.homeworks.homework5;

import ru.otus.java.basic.homeworks.homework5.animals.Animal;

public class Horse extends Animal {
    int speedSwim;
    public Horse(String name, int speedRun, int speedSwim, int stamina) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.stamina = stamina;
    }
}
