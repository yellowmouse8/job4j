package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
     int rsl = 0;
     for (int [] num : array){
         for (int tmp : num){
             list.add(rsl++, tmp);
         }
     }
        return list;
    }

    public static void main(String[] args) {
        ConvertMatrix2List list = new ConvertMatrix2List();
        int[][] input = {{1, 2, 3},
                {4, 5, 6}};

        System.out.println(list.toList(input));
    }
}
