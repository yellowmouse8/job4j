package ru.job4j.models;

import ru.job4j.start.Tracker;

public class DeleteItem extends BaseAction {

    public DeleteItem(int key, String name) {
        super(key, name);
    }

    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("  Enter the task Id for deleting:   ");
        tracker.delete(id);
        System.out.println(" Delete item by id: " + id + " completed. ");
        return true;
    }
}
