package ru.otus.java.basic.homeworks.homework10;

import java.util.HashMap;
import java.util.HashSet;

import java.util.Map;
import java.util.Scanner;

public class PhoneBook {

    public static void main(String[] args) {
        HashSet<String> phones = new HashSet<String>();
//        Map<String, HashSet<String>> PhoneBook = new HashMap<>();
        Map<String, String> PhoneBook = new HashMap<>();


        init(PhoneBook);
        add(PhoneBook);
        for (Map.Entry<String, String> entry : PhoneBook.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(" key=" + key + ", value=" + value);
        }

    }

    public static void init(Map map) {
        map.put("1", "One");
        map.put("2", "Two");
    }

    public static void add(Map map) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите абонента: ");
        String abonent = scan.nextLine();
        System.out.println("Введите номер абонента: ");
        String phone = scan.nextLine();
        map.put(phone, abonent);

    }

}
