package ru.job4j.collection;

import ru.job4j.models.Item;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ItemSorter {
    public static void main(String[] args) {
        List<Item> list = Arrays.asList(
                new Item("DI", "de"),
                new Item("Vi", "d"),
                new Item("Bw", "w")
        );
        System.out.println(list);
        list.sort(new SortByNameItem());
        System.out.println(list);

    }
}
