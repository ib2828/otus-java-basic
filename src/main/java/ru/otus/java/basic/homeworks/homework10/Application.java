package ru.otus.java.basic.homeworks.homework10;

public class Application {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов Иван Иванович", "+7 910 111-11-10");
        phoneBook.add("Петров Петр Петрович", "+7 920 222-22-20");
        phoneBook.add("Петров Петр Петрович", "+7 920 222-22-21");
        phoneBook.add("Петров Петр Петрович", "+7 910 111-11-12");
        phoneBook.add("Сидоров Сидор Сидорович", "+7 930 333-33-30");
        phoneBook.add("Сидоров Сидор Сидорович", "+7 930 333-33-31");

        System.out.println(phoneBook.find("Иванов Иван Иванович"));
        System.out.println(phoneBook.find("Петров Петр Петрович"));
        System.out.println(phoneBook.find("Сидоров Сидор Сидорович"));

        System.out.println(phoneBook.containsPhoneNumber("+7 910 111-11-11"));
        System.out.println(phoneBook.containsPhoneNumber("+7 999 999-99-99"));
    }
}
