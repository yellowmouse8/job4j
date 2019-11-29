package ru.job4j.models;

import ru.job4j.start.Tracker;

public interface UserAction {
    String name();
    boolean execute (Input input, Tracker tracker);
}
