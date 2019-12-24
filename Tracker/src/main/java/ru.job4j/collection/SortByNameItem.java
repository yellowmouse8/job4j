package ru.job4j.collection;

import org.jetbrains.annotations.NotNull;
import ru.job4j.models.Item;

import java.util.Comparator;
import java.util.List;

public class SortByNameItem implements Comparator<Item> {
    @Override
    public int compare(@NotNull Item first, Item second) {
        return first.getName().compareTo(second.getName());
    }
}
