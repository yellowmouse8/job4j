package ru.job4j.collectiontreeset;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class SortByNameUser implements Comparator<UserL> {
    @Override
    public int compare(UserL first, UserL second) {
        int name = first.getName().compareTo(second.getName());
        return name == 0 ? first.getAge().compareTo(second.getAge()) : name;
    }

}
