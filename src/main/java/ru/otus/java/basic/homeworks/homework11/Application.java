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
        // personDataBase.add(person5);                // IllegalArgumentException
        System.out.println(personDataBase.toString()); // {1={Петр, DIRECTOR, 1}, 2={Максим, BRANCH_DIRECTOR, 2}, 3={Олег, DEVELOPER, 3}, 4={Дмитрий, QA, 4}}
        System.out.println();

        System.out.println(personDataBase.findById(1L));    // {Петр, DIRECTOR, 1}
        System.out.println(personDataBase.findById(2L));    // {Максим, BRANCH_DIRECTOR, 2}
        System.out.println(personDataBase.findById(3L));    // {Олег, DEVELOPER, 3}
        System.out.println(personDataBase.findById(4L));    // {Дмитрий, QA, 4}
        // System.out.println(personDataBase.findById(5L)); // IllegalArgumentException
        System.out.println();

        System.out.println(personDataBase.isManager(person1));  // true
        System.out.println(personDataBase.isManager(person2));  // true
        System.out.println(personDataBase.isManager(person3));  // false
        System.out.println(personDataBase.isManager(person4));  // false
        System.out.println(personDataBase.isManager(person5));  // false
        System.out.println();

        System.out.println(personDataBase.isEmployee(1L));  // false
        System.out.println(personDataBase.isEmployee(2L));  // false
        System.out.println(personDataBase.isEmployee(3L));  // true
        System.out.println(personDataBase.isEmployee(4L));  // true
        // System.out.println(personDataBase.isEmployee(5L));  // IllegalArgumentException
        System.out.println();
    }
}
