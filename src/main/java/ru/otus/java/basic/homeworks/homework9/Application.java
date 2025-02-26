package ru.otus.java.basic.homeworks.homework9;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private static Employee Bob = new Employee("Bob", 20);
    private static Employee Jon = new Employee("Jon", 30);
    private static Employee Nick = new Employee("Nick", 40);
    private static Employee Mike = new Employee("Mike", 50);

    public static void main(String[] args) {
        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(3);
        elements.add(5);
        elements.add(7);
        elements.add(9);

        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(Bob);
        employees.add(Jon);
        employees.add(Nick);
        employees.add(Mike);

        System.out.println("Array list последовательных элементов");
        System.out.println(filingList(1, 20));
        System.out.println("Сумма элементов, значение которых больше 5");
        System.out.println(sumElements(elements));
        System.out.println("Замена всех элементов одним числом");
        System.out.println(numberReplace(elements, 9));
        System.out.println("Увеличение каждого элемента массива");
        System.out.println(numberIncrease(elements, 10));
        System.out.println("Список имен сотрудников");
        System.out.println(getEmployeesName(employees));
        System.out.println("Список имен сотрудников с отбором по возрасту");
        System.out.println(getlistEmployeeByMinAge(employees,50));

    }

    public static ArrayList filingList(int minValue, int maxValue) {
        ArrayList<Integer> listLocal = new ArrayList<>();
        for (int i = minValue; i < maxValue + 1; i++) {
            listLocal.add(i);
        }
        return listLocal;
    }

    public static int sumElements(ArrayList<Integer> list) {
        int s = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 5) {
                s += list.get(i);
            }
        }
        return s;
    }

    public static ArrayList numberReplace(ArrayList<Integer> list, int x) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, x);
        }
        return list;
    }

    public static List numberIncrease(List<Integer> list, int x) {
        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i) + x;
            list.set(i, a);
        }
        return list;
    }

    public static List getEmployeesName(ArrayList<Employee> employees){
        ArrayList<String> names = new ArrayList<String>();
        for (int i = 0; i < employees.size(); i++) {
            names.add(employees.get(i).getName());
        }
        return names;
    }

    public static List getlistEmployeeByMinAge(ArrayList<Employee> employees, int minAge) {
        ArrayList<String> names = new ArrayList<String>();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getAge() >= minAge) {
                names.add(employees.get(i).getName());
            }
        };
        return names;
    }

}
