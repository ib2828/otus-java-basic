package ru.otus.java.basic.homeworks.homework7.transport;

import ru.otus.java.basic.homeworks.homework7.Terrain;

public class AllTerrainVehicle extends Transport {

    private final String type;
    private double energy;
    private double coefficient;

    public AllTerrainVehicle(double gas, double consumptionCoef) {
        type = "Вездеход";
        this.energy = gas;
        this.coefficient = consumptionCoef;
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
        if (!enoughEnergy(energy, distance)) {
            System.out.println("Не хватает " + ((distance * coefficient) - energy) + " л. бензина для перемещения на " + distance + " км");
            return false;
        }
        this.energy -= (distance * coefficient);
        System.out.println(type + " проехал " + distance + " км. по " + terrain.getType() + ". Текущее количество топлива " + this.energy + " л.");
        return true;
    }

    @Override
    public boolean enoughEnergy(double energy, double distance) {
        return (energy - (distance * coefficient) > 0);
    }
}
