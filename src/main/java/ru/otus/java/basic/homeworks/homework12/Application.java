package ru.otus.java.basic.homeworks.homework12;

import java.io.*;


public class Application {
    public static void main(String[] args) {
        listing_dir();
    }

    public static void listing_dir() {
        File dir = new File("./");
        FilenameFilter txtFilter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".txt");
            }
        };

        File[] filesList = dir.listFiles(txtFilter);

        for (File file : filesList) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }

        }
    }
}

