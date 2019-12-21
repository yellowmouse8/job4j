package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;

public class OrderConvert {

    public static HashMap<Integer, User> process(List<User> users) {
        HashMap<Integer , User> map = new HashMap<>();
        for (User oyMy : users){
            map.put(oyMy.getId(), oyMy);
        }
        return map;
    }
}