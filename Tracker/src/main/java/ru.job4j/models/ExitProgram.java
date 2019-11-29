package ru.job4j.models;

import ru.job4j.start.Tracker;

public class ExitProgram implements UserAction {
    public String name (){
        return "Exit program.";
    }
    public boolean execute (Input input, Tracker tracker){
        System.out.println(" NO tasks anymore. ");
        System.out.println(" Exit. ");
    return false;
    }
}
