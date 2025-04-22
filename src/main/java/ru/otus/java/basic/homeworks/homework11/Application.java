package ru.otus.java.basic.homeworks.homework11;

public class Application {
    public static void main(String[] args) {
        Person person1 = new Person("Иван", Position.DIRECTOR, 1L);
        Person person2 = new Person("Петр", Position.BRANCH_DIRECTOR, 2L);
        Person person3 = new Person("Василий", Position.DEVELOPER, 3L);
        Person person4 = new Person("Тимофей", Position.QA, 4L);
        Person person5 = new Person("Алексей", Position.DRIVER, 1L);

        PersonDataBase personDataBase = new PersonDataBase();

        personDataBase.add(person1);
        personDataBase.add(person2);
        personDataBase.add(person3);
        personDataBase.add(person4);
        System.out.println(personDataBase.toString());
        System.out.println();

        System.out.println(personDataBase.findById(1L));
        System.out.println(personDataBase.findById(2L));
        System.out.println(personDataBase.findById(3L));
        System.out.println(personDataBase.findById(4L));
        System.out.println();

        System.out.println(personDataBase.isManager(person1));
        System.out.println(personDataBase.isManager(person2));
        System.out.println(personDataBase.isManager(person3));
        System.out.println(personDataBase.isManager(person4));
        System.out.println(personDataBase.isManager(person5));
        System.out.println();

        System.out.println(personDataBase.isEmployee(1L));
        System.out.println(personDataBase.isEmployee(2L));
        System.out.println(personDataBase.isEmployee(3L));
        System.out.println(personDataBase.isEmployee(4L));
        System.out.println();
    }
}
