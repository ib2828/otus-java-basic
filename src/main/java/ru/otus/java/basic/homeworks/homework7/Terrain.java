package ru.otus.java.basic.homeworks.homework7;

public enum Terrain {

    FOREST("Густой лес"),
    PLAIN("Равнина"),
    SWAMP("Болото");

    private final String type;

    Terrain(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
