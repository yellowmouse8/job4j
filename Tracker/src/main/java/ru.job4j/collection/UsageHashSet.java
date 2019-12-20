package ru.job4j.collection;

import java.util.HashSet;

public class UsageHashSet {
    public static void main (String[]args){
        HashSet<String> autoModels = new HashSet<>();
        autoModels.add("BMW");
        autoModels.add("Lada");
        autoModels.add("Volvo");
        autoModels.add("Volvo");
        autoModels.add("Toyota");
        for (String t : autoModels) {
        System.out.println("Model Car: " + t);
        }
    }
}
