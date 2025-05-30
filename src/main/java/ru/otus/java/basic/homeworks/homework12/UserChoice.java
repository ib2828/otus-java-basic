package ru.otus.java.basic.homeworks.homework12;
import java.io.*;
import java.util.Scanner;

public class UserChoice {
    public static String SelectFile(File[] files) {

        if (files == null || files.length == 0) {
            return null;
        }

        String[] fileNames = new String[files.length];
        for (int i = 0; i < files.length; i++) {
            fileNames[i] = files[i].getName();
        }

        String fileName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла, содержимое которого вы хотите увидеть: ");
        while (true) {
            fileName = scanner.nextLine();
            boolean found = false;
            for (String item : fileNames) {
                if (item.equals(fileName)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            } else {
                System.out.println("Такого текстового файла нет в каталоге проекта. Введите имя файла из списка выше");
            }
        }
        System.out.println("Вы выбрали файл: " + fileName);
        return fileName;
    }
}
