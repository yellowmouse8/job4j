package ru.job4j.models;

import ru.job4j.start.Tracker;

public class FindbyName implements UserAction {
    public String name() {
        return " Find item by Name.";
    }

    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr(" Enter your Name item: ");
        Item[] items = tracker.findByName(name);
        if (items !=  null) {
            for (Item item : items) {
                System.out.println("Id: " + item.getId() + " Name: "
                        + item.getName());
            }
        } else {
            System.out.println(" NO Item with that Name");
        }
        System.out.println("==== End Search. ===== ");
        return true;
    }
}
