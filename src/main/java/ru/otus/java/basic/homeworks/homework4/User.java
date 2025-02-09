package ru.otus.java.basic.homeworks.homework4;

import java.time.*;

public class User {
    private String surname;
    private String name;
    private String patronymic;
    private int yearOfBirth;
    private String email;

    public User(String surname, String name, String patronymic, int yearOfBirth, String email) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }

    public void printUserInfo() {
        System.out.print(this.surname + "  ");
        System.out.print(this.name + "  ");
        System.out.print(this.patronymic + "  ");
        System.out.print(this.yearOfBirth + "  ");
        System.out.print(this.email + "  ");
        System.out.println();
    }

    public int getAge() {
        return 2025 - this.yearOfBirth;
    }
}

