package ru.job4j.comparator;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class UserSorter {
    public TreeSet<UserCom> nameToPriorityBegin(List<UserCom> list) {
        TreeSet<UserCom> sorter = new TreeSet<>();
        list.sort(new NameBeginComp().thenComparing(new PriorityBeginComp()));
        return sorter;
    }

    public TreeSet<UserCom> nameToPriorityEnd(List<UserCom> list) {
        TreeSet<UserCom> sorting = new TreeSet<>();
        list.sort(new NameEndComp().thenComparing(new PriorityEndComp()));
        return sorting;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                ("BAB"),
                ("ADA"),
                ("DAD"),
                ("CAC"));
        UserSorter userSorter = new UserSorter();
        list.sort(new StringCompare());
        System.out.println(list);
    }

}
