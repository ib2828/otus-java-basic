package ru.otus.java.basic.homeworks.homework7.transport;

import ru.otus.java.basic.homeworks.homework7.Terrain;

public interface moveTransport {

    boolean canMove(double energy, double distance, Terrain terrain);

    boolean enoughEnergy(double energy, double distance);

    double getEnergy();

    String getType();
}
