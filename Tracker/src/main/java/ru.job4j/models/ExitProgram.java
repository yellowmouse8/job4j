package ru.job4j.models;


import ru.job4j.start.Tracker;

public class ExitProgram extends BaseAction {
    public ExitProgram(int key, String name) {
        super(key, name);
    }

    public boolean execute(Input input, Tracker tracker) {
        System.out.println(" NO tasks anymore. ");
        System.out.println(" Exit. ");
        return false;
    }
}
