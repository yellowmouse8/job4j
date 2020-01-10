package ru.job4j.departments;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps ){
        HashSet <String> tmp = new HashSet<>();
        for (String i : deps){
            String start = "";
            for (String b : i.split("/")){
                tmp.add(start + "/" + b);
                if (!deps.contains(b)){
                    tmp.add(i);

                }
            }
        }
        List<String> list = new ArrayList<>(tmp);
        Departments.sortAsc(list);
        return list;
    }

    public static void sortAsc (List <String> orgs){
        orgs.addAll(Departments.fillGaps(orgs));
        orgs.sort(Comparator.naturalOrder());
    }
    public static void sortDesc (List<String> orgs){
    orgs.sort(new DepDescComp());
    }
    public static void main (String[]args){
        List <String> list = new ArrayList<>(Arrays.asList("K1/SK1"
                ,"K1/SK2"
                ,"K1/SK1/SSK1"
                ,"K1/SK1/SSK2"
                ,"K2"
                ,"K2/SK1/SSK1"
                ,"K2/SK1/SSK2"));
        System.out.println(Departments.fillGaps(list));
        Departments.sortDesc(list);
        System.out.println(list);
        Departments.sortAsc(list);
        System.out.println(list);
    }
}
