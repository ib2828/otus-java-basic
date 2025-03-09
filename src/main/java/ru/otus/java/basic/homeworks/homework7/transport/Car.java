package ru.otus.java.basic.homeworks.homework7.transport;

import ru.otus.java.basic.homeworks.homework7.Terrain;

public class Car extends Transport {

    private final String type;
    private double energy;
    private double coefficient;

    public Car(double energy, double coefficient) {
        type = "Машина";
        this.energy = energy;
        this.coefficient = coefficient;
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
        if (terrain == Terrain.SWAMP || terrain == Terrain.FOREST) {
            System.out.println(type + " не может перемещаться по " + terrain.getType());
            return false;
        }
        if (!enoughEnergy(energy, distance)) {
            System.out.println("Не хватает " + ((distance * coefficient) - energy) + " л. бензина для перемещения на " + distance + " км");
            return false;
        }
        energy -= (distance * coefficient);
        System.out.println(type + " проехала " + distance + " км. по " + terrain.getType() + ". Текущее количество топлива " + energy + " л.");
        return true;
    }

    @Override
    public boolean enoughEnergy(double energy, double distance) {
        return (energy - (distance * coefficient) > 0);
    }
}
