package ru.job4j.comparator;

import ru.job4j.collection.User;

import java.util.Comparator;

public class PriorityBeginComp implements Comparator<UserCom> {
    @Override
    public int compare(UserCom first, UserCom second) {
        return Integer.compare(first.getPriority(), second.getPriority());
    }
}
