package ru.job4j.collection;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
       var result = new ArrayList<Person>();
        for (var value : persons) {
            if (value.getName().contains(key)
                    || value.getSurname().contains(key)
                    || value.getPhone().contains(key)
                    || value.getAddress().contains(key)) {
                result.add(value);
            }
        }

        return result;
    }
}
