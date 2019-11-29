package ru.job4j.models;

import ru.job4j.start.Tracker;

public class DeleteItem implements UserAction {
    @Override
    public String name() {
        return " Delete item.  ";
    }

    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("  Enter the task Id for deleting:   ");
        tracker.delete(name);
        if (tracker.findById(name) == null) {
            System.out.println(" Delete item by id: " + name + " completed. ");
        } else {
            System.out.println(" No task with that id. ");
        }
        return true;
    }
}
