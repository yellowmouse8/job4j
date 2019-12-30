package ru.job4j.models;

import ru.job4j.start.Tracker;

public interface UserAction {
    int key();

    boolean execute(Input input, Tracker tracker);

    String info();
}
