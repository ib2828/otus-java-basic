package ru.otus.java.basic.homeworks.homework11;

public enum Position {
    MANAGER,
    DIRECTOR,
    DRIVER,
    ENGINEER,
    SENIOR_MANAGER,
    DEVELOPER,
    QA,
    JANITOR,
    PLUMBER,
    BRANCH_DIRECTOR,
    JUNIOR_DEVELOPER;

    public String getName() {
        return name;
    }

    final String name;

    Position(String name) {
        this.name = name;
    }
}
