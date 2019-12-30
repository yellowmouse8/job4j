package ru.job4j.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> adds = new ArrayList<>();
        adds.add("Petr");
        adds.add("Ivan");
        adds.add("Stepan");
        for (Object names : adds) {
            System.out.println(names);
        }
    }
}
