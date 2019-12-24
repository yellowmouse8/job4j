package ru.job4j.collection;

import ru.job4j.models.Item;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ItemSorter {
    public static void main(String[] args) {
        List<Item> list = Arrays.asList(
                new Item("0-1", "DI"),
                new Item("0-2", "Vi"),
                new Item("0-3", "Bw")
        );
        list.sort(new SortByNameItem());
        System.out.println(list);

    }
}
