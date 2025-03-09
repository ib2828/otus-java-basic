package ru.otus.java.basic.homeworks.homework7;

import ru.otus.java.basic.homeworks.homework7.transport.*;

public class Application {

    public static void main(String[] args) {

        Human human = new Human("Иван", 20);

        Transport atv = new AllTerrainVehicle(100, 0.3);
        Transport bike = new Bike(human);
        Transport car = new Car(50, 0.08);
        Transport horse = new Horse(30);

        human.useTransport(atv);
        human.move(23, Terrain.FOREST);
        human.move(34, Terrain.PLAIN);
        human.move(45, Terrain.SWAMP);
        human.leaveTransport();
        System.out.println();

        human.useTransport(bike);
        human.move(5, Terrain.FOREST);
        human.move(10, Terrain.PLAIN);
        human.move(5, Terrain.SWAMP);
        human.leaveTransport();
        System.out.println();

        human.useTransport(car);
        human.move(25, Terrain.FOREST);
        human.move(35, Terrain.PLAIN);
        human.move(45, Terrain.SWAMP);
        human.leaveTransport();
        System.out.println();

        human.useTransport(horse);
        human.move(10, Terrain.FOREST);
        human.move(100, Terrain.PLAIN);
        human.move(10, Terrain.SWAMP);
        human.leaveTransport();
        System.out.println();
    }
}
