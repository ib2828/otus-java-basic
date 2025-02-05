package ru.otus.java.basic.homeworks.homework4;

public class Box {
    private int length;
    private int width;
    private int height;
    private String color;
    private boolean isOpened;
    private boolean isItem;

    public Box(int length, int width, int height, String color, boolean isOpened, boolean isItem) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
        this.isOpened = isOpened;
        this.isItem = isItem;

    }

    public void getInfo() {
        System.out.println("Длина коробки " + length);
        System.out.println("Ширина коробки " + width);
        System.out.println("Высота коробки " + height);
        System.out.println("Цвет коробки " + color);
        System.out.println("Коробка открыта? " + isOpened);
        System.out.println();
    }

    public void putItem() {
        if (isOpened) {
            System.out.println("Не удалось положить в коробку предмет. Коробка закрыта");
            return;
        }
        if (isItem) {
            System.out.println("Не удалось положить в коробку предмет. В коробке уже есть предмет");
            return;
        }
        isItem = true;
        System.out.println("Предмет положен в коробку");
    }

    public void getItem() {
        if (this.isOpened) {
            if (this.isItem) {
                this.isItem = false;
                System.out.println("Предмет извлечен из коробки");
            } else {
                System.out.println("В коробке нету предмета");
            }
        } else {
            System.out.println("Коробка закрыта");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Цвет коробки изменен на " + color);
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void open() {
        System.out.println("Коробка открыта");
        isOpened = true;
    }

    public void close() {
        System.out.println("Коробка закрыта");
        isOpened = false;
    }
}
