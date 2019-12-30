package ru.job4j.models;

import ru.job4j.start.Tracker;

public class StubAction implements UserAction {
    private boolean call = false;

    @Override
    public int key() {
        return 0;
    }

    @Override
    public String info() {
        return " ";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        call = true;
        return false;
    }

    public boolean isCall() {
        return call;
    }
}
