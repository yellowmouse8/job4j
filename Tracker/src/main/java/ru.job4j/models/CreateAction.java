package ru.job4j.models;

import ru.job4j.start.Tracker;



public class CreateAction extends BaseAction {
    public CreateAction( String name ){
        super(name);
    }
    @Override
    public boolean execute (Input input, Tracker tracker){
        String name = input.askStr(" Enter name: ");
        String id = input.askStr(" Enter ID: ");
        Item item = new Item(id , name);
        tracker.add(item);
        System.out.println(" New item with name:" + item.getName() + " added.  ");
        return true;
    }
}
