package ru.job4j.models;

import ru.job4j.start.Tracker;

public class FindByID implements UserAction {
    public String name(){
        return " Find item by ID  : ";
    }
    public boolean execute (Input input , Tracker tracker){
        String name = input.askStr(" Enter the ID what you want to find: ");
        tracker.findById(name);
        if (tracker.findById(name)!= null){
            System.out.println(" Your Id is:  " + tracker.findById(name));
        } else { System.out.println("  No ID with that name.  ");}
        return true;
    }
}
