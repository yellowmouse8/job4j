package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;

public class OrderConvert {

    public static HashMap<String, User> process(List<User> users) {
        HashMap<String, User> map = new HashMap<>();
        for (User el : users){
            map.put(el.getId(), el);
        }
        return map;
    }
}