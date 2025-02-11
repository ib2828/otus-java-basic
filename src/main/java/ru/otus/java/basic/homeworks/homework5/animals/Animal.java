package ru.otus.java.basic.homeworks.homework5.animals;

import java.util.Scanner;

public abstract class Animal {
    protected String name;
    protected int speedRun;
    protected int stamina;
    protected int staminaOfRun;

    public float run(int distance) {
        if (this.stamina < distance) {
            System.out.println("Не хватает выносливости");
            return -1;
        } else {
            this.stamina = this.stamina - distance;
            System.out.println("Животное пробежало дистанцию:" + distance);
            return distance / this.speedRun;
        }
    }

    public float swim(int distance, int speedSwim) {
        return distance / speedSwim;
    }

    public void info() {
        System.out.println("У " + name + " осталось " + this.stamina + " единиц выносливости");
    }

    public int getAction() {
        Scanner scannerAction = new Scanner(System.in);
        System.out.println("Введите номер необходимого дейстия");
        System.out.println("1 Животное побежало");
        System.out.println("2 Животное поплыло");
        System.out.println("3 Информация о животном");
        int methodAction = scannerAction.nextInt();
        if (methodAction != 1 || methodAction != 2 || methodAction != 3 ) {
            return methodAction;
        }
        else {
            return 0;
        }
    }
}
