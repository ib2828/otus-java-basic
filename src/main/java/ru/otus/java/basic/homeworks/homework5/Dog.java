package ru.otus.java.basic.homeworks.homework5;

import ru.otus.java.basic.homeworks.homework5.animals.Animal;

public class Dog extends Animal {
    int speedSwim;
    public Dog(String name, int speedRun, int speedSwim, int stamina) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.stamina = stamina;
    }
}
