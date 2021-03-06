package ru.job4j.models;

import ru.job4j.start.Tracker;

import java.util.List;

public class FindbyName extends BaseAction {
    public FindbyName(int key, String name) {
        super(key, name);
    }

    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr(" Enter your Name item: ");
        List<Item> items = tracker.findByName(name);

        if (items.size() != 0) {
            for (Item item : items) {
                System.out.println(" Name : " + item.getName());
            }
        } else {
            System.out.println(" No Item with that Name. ");
        }

        System.out.println("==== End Search. ===== ");
        return true;
    }
}
