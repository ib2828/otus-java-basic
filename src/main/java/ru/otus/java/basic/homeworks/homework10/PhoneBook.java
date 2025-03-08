package ru.otus.java.basic.homeworks.homework10;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    // 4. Под одним именем может быть несколько телефонов
    // (в случае однофамильцев, или наличии у одного человека нескольких номеров),
    // тогда при запросе такой фамилии должны выводиться все телефоны
    private Map<String, List<String>> phoneBook;

    PhoneBook() {
        phoneBook = new HashMap<>();
    }

    @Override
    public String toString() {
        return phoneBook.toString();
    }

    public void add(String name, String phoneNumber) {

        phoneBook.putIfAbsent(name, new ArrayList<>());
        phoneBook.get(name).add(phoneNumber);
    }

    public List<String> find(String name) {

        return phoneBook.getOrDefault(name, new ArrayList<>());
    }

    public boolean containsPhoneNumber(String phoneNumber) {

        boolean result = false;
        for (List<String> phoneNumbers : phoneBook.values()) {
            if (phoneNumbers.contains(phoneNumber)) {
                result = true;
                break;
            }
        }
        return result;
    }
}