package ru.otus.java.basic.homeworks.homework5;

import ru.otus.java.basic.homeworks.homework5.animals.Animal;

public class Cat extends Animal {

    public Cat(String name, int speedRun, int endurance){
        this.name = name;
        this.speedRun = speedRun;
        this.endurance = endurance;
    }
    @Override
    public void swim(int distance){
        System.out.println("Кот не умеет плавать");
    }
}
