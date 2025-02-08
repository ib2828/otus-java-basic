package ru.otus.java.basic.homeworks.homework5.animals;

public class Animal {
    String name;
    int speedRun;
    int speedSwim;
    int endurance;
    int enduranceRun;
    int enduranceSwim;

    public float run(int distance, int speedRun){
        return distance/speedRun;
    }
    public float swim(int distance, int speedSwim){
        return distance/speedSwim;
    }
}
