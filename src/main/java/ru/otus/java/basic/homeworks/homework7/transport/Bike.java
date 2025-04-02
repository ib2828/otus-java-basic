package ru.otus.java.basic.homeworks.homework7.transport;

import ru.otus.java.basic.homeworks.homework7.Human;
import ru.otus.java.basic.homeworks.homework7.Terrain;

public class Bike extends Transport {

    private final String type;
    private double energy;

    public Bike(Human human) {
        type = "Велосипед";
        this.energy = human.getEnergy();
    }

    @Override
    public double getEnergy() {
        return energy;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public boolean canMove(double energy, double distance, Terrain terrain) {
        if (terrain == Terrain.SWAMP) {
            System.out.println(type + " не может перемещаться по " + terrain.getType());
            return false;
        }
        if (!enoughEnergy(energy, distance)) {
            System.out.println("Велосипедисту не хватит сил для перемещения на " + distance + " км");
            return false;
        }
        this.energy -= distance;
        System.out.println(type + " проехал " + distance + " км. по " + terrain.getType() + ". Текущее количество энергии " + this.energy + " у.е.");
        return true;
    }

    @Override
    public boolean enoughEnergy(double energy, double distance) {
        return (energy - distance > 0);
    }
}
