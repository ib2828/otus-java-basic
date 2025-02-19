package ru.otus.java.basic.homeworks.homework5;

import ru.otus.java.basic.homeworks.homework5.animals.Animal;

public class Dog extends Animal {
    int speedSwim;
    public Dog(String name, int speedRun, int speedSwim, int endurance) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.endurance = endurance;
    }
    @Override
    public void swim(int distance) {
        if (this.endurance * 2 < distance) {
            System.out.println("Не хватает выносливости");
            return -1;
        } else {
            this.endurance = this.endurance - distance;
            System.out.println("Животное проплыло дистанцию:" + distance);
            return distance / this.speedRun;
        }
    }
}
