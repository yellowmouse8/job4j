package ru.job4j.comparator;

import java.util.Comparator;

public class NameEndComp implements Comparator<UserCom> {
    @Override
    public int compare(UserCom first, UserCom second) {
        return second.getName().compareTo(first.getName());
    }
}
