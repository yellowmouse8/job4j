package ru.job4j.models;

import ru.job4j.start.Tracker;

public class DeleteItem implements UserAction {
    @Override
    public String name() {
        return " Delete item.  ";
    }

    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("  Enter the task Id for deleting:   ");
        tracker.delete(id);
        System.out.println(" Delete item by id: " + id + " completed. ");
     return true;
    }
}
