package ru.job4j.collection;

import ru.job4j.search.Task;

import java.util.ArrayList;
import java.util.HashSet;

public class TaskOrder {


        public HashSet<TaskL> find (HashSet<TaskL> taskLS) {
            HashSet<TaskL> result = new HashSet<>();
            for (TaskL value : taskLS) {
                result.add(value);

                return result;
            }
        }

    public static void main (String[]args){
        TaskOrder order = new TaskOrder();
        HashSet <TaskL> oi = new HashSet<>();
        oi.add(new TaskL("12", " Bi"));
        oi.add(new TaskL("2", " UF"));
        oi.add(new TaskL("2", " UF"));
        oi.add(new TaskL("2", " UF"));
        order.find(oi);
        System.out.println(oi);
    }
}
