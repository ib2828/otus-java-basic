package ru.otus.java.basic.homeworks.homework5.animals;

public abstract class Animal {
    protected String name;
    protected int speedRun;
    protected int endurance;
    public float run(int distance) {
        if (this.endurance < distance) {
            System.out.println("Не хватает выносливости");
            return -1;
        } else {
            this.endurance = this.endurance - distance;
            System.out.println("Животное пробежало дистанцию:" + distance);
            return distance / this.speedRun;
        }
    }

    public abstract void swim(int distance);

    public void info() {
        System.out.println("У " + this.name + " осталось " + this.endurance + " единиц выносливости");
    }

}
