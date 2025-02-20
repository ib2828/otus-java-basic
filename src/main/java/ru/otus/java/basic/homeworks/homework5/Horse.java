package ru.otus.java.basic.homeworks.homework5;

import ru.otus.java.basic.homeworks.homework5.animals.Animal;

public class Horse extends Animal {
    int speedSwim;
    int enduranceSwim = 4;

    public Horse(String name, int speedRun, int speedSwim, int endurance) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.endurance = endurance;
    }

    @Override
    public float swim(int distance) {
        if (this.endurance * this.enduranceSwim < distance) {
            System.out.println("Не хватает выносливости");
            return -1;
        } else {
            this.endurance = this.endurance - distance;
            System.out.println("Животное проплыло дистанцию:" + distance);
            return distance / this.speedRun;
        }
    }
}
