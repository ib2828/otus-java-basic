package ru.otus.java.basic.homeworks.homework5.animals;

public class Animal {
    String name;
    int speedRun;
    int speedSwim;
    int endurance;
    int enduranceRun;
    int enduranceSwim;

    public int run(int distance){
        return distance/speedRun;
    }
    public int swim(int distance){
        return  distance/speedSwim;
    }
}
