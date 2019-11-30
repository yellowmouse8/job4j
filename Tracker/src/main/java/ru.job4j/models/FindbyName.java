package ru.job4j.models;

import ru.job4j.start.Tracker;

public class FindbyName implements UserAction {
    public String name() {
        return " Find item by Name.";
    }

    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr(" Enter your Name item: ");
        Item item = new Item(name,name);
        System.out.println(" Item founded:  " + item.getName());
        System.out.println("==== End Search. ===== ");
        return true;
    }
}
