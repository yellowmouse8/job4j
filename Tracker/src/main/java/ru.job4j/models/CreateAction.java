package ru.job4j.models;

import ru.job4j.start.Tracker;


public class CreateAction implements UserAction {
    @Override
    public String name(){
        return " === Add new Item. ==== ";
    }
    @Override
    public boolean execute (Input input, Tracker tracker){
        String name = input.askStr(" Enter name: ");
        Item item = new Item(name, name);
        tracker.add(item);
        System.out.println(" New item with name:" + item.getName() + " added.  ");
        return true;
    }
}
