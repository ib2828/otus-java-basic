package ru.otus.java.basic.homeworks.homework13.client;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class client {
    private final DataInputStream in;
    private final PrintStream out;

    public static void main(String[] args) {
        try(Socket socket = new Socket("localhost", 8888)) {
            client client = new client(socket);
            String result = client.read();
            System.out.print(result);
            result = client.read();
            System.out.print(result);

            System.out.print("Введите математическую операцию: ");

            Scanner scanner  = new Scanner(System.in);
            String userInput = scanner.nextLine();
            scanner.close();

            client.send(userInput);
            result = client.read();
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public client(Socket socket) throws IOException {
        in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        out = new PrintStream(socket.getOutputStream());
    }

    public void send(String message) {
        out.println(message);
        out.flush();
    }

    public String read() throws IOException {
        return in.readUTF();
    }

}