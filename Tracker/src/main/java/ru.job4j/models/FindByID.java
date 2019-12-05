package ru.job4j.models;

import ru.job4j.start.Tracker;

public class FindByID extends BaseAction {

    public FindByID (int key, String name){
        super(key,name);
    }

    public boolean execute (Input input , Tracker tracker){
        String id = input.askStr(" Enter the ID what you want to find: ");
        Item found = tracker.findById(id);
            System.out.println(" Your Id is:  " + found.getId()
                    + " Name: " + found.getName() + ". " );
        return true;
    }
}
