package ru.job4j.models;

import ru.job4j.start.Tracker;

public class ShowAllItems extends BaseAction {
    public ShowAllItems(int key, String name) {
        super(key, name);
    }

    public boolean execute(Input input, Tracker tracker) {
        System.out.println(" List of all items: ");
        for (Item items : tracker.findAll()) {
            System.out.println(" Id item: " + items.getId() + " Name item: " + items.getName());
        }
        System.out.println(" List of items. ");
        return true;
    }
}
