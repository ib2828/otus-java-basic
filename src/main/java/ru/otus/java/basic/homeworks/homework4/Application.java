package ru.otus.java.basic.homeworks.homework4;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        User[] users = {
                new User("Лапшин", "Артемий", "Алексеевич", 1980, "lapshin@mail.ru"),
                new User("Семенова", "Милана", "Николаевна", 1992, "milana@mail.ru"),
                new User("Борисова", "Анна", "Руслановна", 2001, "anna@mail.ru"),
                new User("Копылова", "Елизавета", "Ивановна", 2005, "liza@mail.ru"),
                new User("Полякова", "Екатерина", "Ивановна", 1979, "katy@mail.ru"),
                new User("Зайцев", "Александр", "Ярославович", 1995, "sasha@mail.ru"),
                new User("Иванова", "Алена", "Львовна", 1987, "alena@mail.ru"),
                new User("Овчинникова", "Александра", "Максимовна", 1990, "sash2@mail.ru"),
                new User("Шестаков", "Максим", "Фёдорович", 1988, "max@mail.ru"),
                new User("Добрынина", "Алиса", "Леонидовна", 1973, "alisa@mail.ru"),
        };
        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() > 40) {
                users[i].getUserInfo();
            }
        }
        System.out.println("##########################################################################################");
        System.out.println("##########################################################################################");
        System.out.println("##########################################################################################");
        boolean nextLoop = true;
        Box box1 = new Box(1, 2, 4, "White", true, false);
        Scanner scanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);

        do {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Введите номер необходимого действия");
            System.out.println("1 Вывод информации о коробке");
            System.out.println("2 Изменение цвета коробки");
            System.out.println("3 Открыть коробку");
            System.out.println("4 Закрыть коробку");
            System.out.println("5 Положить предмет в коробку");
            System.out.println("6 Извлечь предмет из коробки");
            System.out.println("0 Для выхода из программы");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            int numberMethod = scanner.nextInt();
            switch (numberMethod) {
                case 1:
                    System.out.println("Информация о коробке");
                    box1.getInfo();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Введите нужный цвет коробки");
                    String color = stringScanner.next();
                    box1.setColor(color);
                    System.out.println();
                    break;
                case 3:
                    box1.open();
                    break;
                case 4:
                    box1.close();
                    break;
                case 5:
                    box1.putItem();
                    break;
                case 6:
                    box1.getItem();
                    break;
                case 0:
                    System.out.println("Спасибо! Вы закончили работу");
                    nextLoop = false;
                    break;
                default:
                    System.out.println("Спасибо! Вы выбрали несуществующий метод ");
                    break;
            }
        } while (nextLoop);


    }
}
