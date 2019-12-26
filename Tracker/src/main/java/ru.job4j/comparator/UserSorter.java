package ru.job4j.comparator;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class UserSorter {
    public TreeSet <UserCom> nameToPriorityBegin (List <UserCom> list){
        TreeSet <UserCom> sorter = new TreeSet<>();
        list.sort(new NameBeginComp().thenComparing(new PriorityBeginComp()));
        return sorter;
    }
    public TreeSet <UserCom> nameToPriorityEnd (List <UserCom> list){
        TreeSet <UserCom> sorting = new TreeSet<>();
        list.sort(new NameEndComp().thenComparing(new PriorityEndComp()));
        return sorting;
    }
    public static void main (String[]args){
        List <UserCom> list = Arrays.asList(
                new UserCom("Vi", 1),
                new UserCom("Vi", 4),
                new UserCom("Vi", 3),
                new UserCom("Bi", 6));
        UserSorter userSorter = new UserSorter();
        userSorter.nameToPriorityBegin(list);
        System.out.println(list);
        userSorter.nameToPriorityEnd(list);
        System.out.println(list);
    }

}
