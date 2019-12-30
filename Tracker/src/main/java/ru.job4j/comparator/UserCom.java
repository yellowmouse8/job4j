package ru.job4j.comparator;

import org.jetbrains.annotations.NotNull;

public class UserCom implements Comparable<UserCom> {

    private String name;
    private int priority;

    public UserCom(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return " Job { " + name + ", " + priority + '}';
    }

    @Override
    public int compareTo(@NotNull UserCom another) {
        return Integer.compare(priority, another.priority);
    }
}
