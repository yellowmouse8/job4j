package ru.job4j.models;

import ru.job4j.start.Tracker;

public class ReplaceItem implements UserAction{
    public String name (){
        return " Edit Items ";
    }
    public boolean execute (Input input, Tracker tracker){
        String name = input.askStr(" Enter name: ");
        String id = input.askStr(" Enter id: ");
        Item item = new Item(id, name);
        item.setId(id);
        tracker.replace(id, item);
        System.out.println(" Item name: "  + name + "editing to :"
        +tracker.replace(id, item));
        System.out.println(" ID item : "  + id + " is invalid. ");
        return true;
    }
}
