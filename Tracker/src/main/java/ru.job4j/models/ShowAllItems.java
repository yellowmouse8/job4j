package ru.job4j.models;

import ru.job4j.start.Tracker;

public class ShowAllItems implements UserAction {
    public String name (){
        return " Show all items. ";
    }
    public boolean execute (Input input, Tracker tracker){
        System.out.println(" Show all items: ");
        for (Item items: tracker.findAll()){
            System.out.println(" Id item: " + items.getId() + " Name item: " + items.getName());
        } System.out.println(" Items founded ");
        return true;
    }
}
