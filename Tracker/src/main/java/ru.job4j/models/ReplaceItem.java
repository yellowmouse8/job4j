package ru.job4j.models;

import ru.job4j.start.Tracker;

public class ReplaceItem extends BaseAction {
    public ReplaceItem(int key, String name) {
        super(key, name);
    }

    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr(" Enter name: ");
        String id = input.askStr(" Enter id: ");
        Item item = new Item(id, name);
        item.setId(id);
        if (tracker.replace(id, item)) {
            System.out.println(" Item name: " + name + "editing to :"
                    + tracker.replace(id, item));

        } else {
            System.out.println(" ID item : " + id + " not founded. ");
        }
        return true;
    }
}
