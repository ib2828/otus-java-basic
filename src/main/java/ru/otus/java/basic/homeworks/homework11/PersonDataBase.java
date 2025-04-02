package ru.otus.java.basic.homeworks.homework11;

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;


public class PersonDataBase {
    private final HashMap<Long, Person> mapOfPerson = new HashMap<>();
    private final HashSet<Position> positions = new HashSet<>();

    public HashMap<Long, Person> getMapOfPerson() {
        return mapOfPerson;
    }

    public Person findById(Long id) {
        return mapOfPerson.get(id);

    }

    public void add(Person person) {
        mapOfPerson.put(person.getId(), person);
    }

    public boolean isManager(Person person) {
        Position position = mapOfPerson.get(person.getId()).getPosition();
        return positions.contains(position);
    }

    public boolean isEmployee(Long id) {
        return !isManager(findById(id));
    }

}
