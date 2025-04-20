package ru.otus.java.basic.homeworks.homework12;

import java.io.*;

public class Application {
    public static void main(String[] args) {

        String pathProject = System.getProperty("user.dir") + "/";
        String extension = ".txt";

        WorkFiles workDir = new WorkFiles(pathProject, extension);

        File[] files = workDir.GettingListFiles(pathProject, extension);
        String fileName = UserChoice.SelectFile(files);
        workDir.CustomFileReader(fileName, pathProject);
        workDir.NewLineWriter(fileName, pathProject);
        workDir.CustomFileReader(fileName, pathProject);
    }
}

