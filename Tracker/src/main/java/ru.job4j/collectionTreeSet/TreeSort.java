package ru.job4j.collectiontreeset;

import java.util.*;

public class TreeSort {

    public TreeSet<UserL> sorting(List<UserL> list) {
        TreeSet<UserL> sorting = new TreeSet<>();
        list.sort(new SortByNameUser());
        return sorting;
    }

    public static void main(String[] args) {
        List<UserL> list = Arrays.asList(new UserL("PI", 28),
                new UserL("Vi", 23),
                new UserL("Bi", 24),
                new UserL("Me", 19),
                new UserL("Bi", 15));
        TreeSort treeSort = new TreeSort();
        treeSort.sorting(list);
        System.out.println(list);
    }
}
