package ru.job4j.collection;

import ru.job4j.search.Task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TaskOrder {

    public HashSet<TaskL> find(List<TaskL> taskLS) {
        HashSet<TaskL> taskLHashSet = new HashSet<>();
        if (taskLS != null) {
            for (TaskL value : taskLS) {
                taskLHashSet.add(value);
            }
        }
        return taskLHashSet;
    }

    public static void main(String[] args) {
        TaskOrder order = new TaskOrder();
        List<TaskL> oi = new ArrayList<>();
        oi.add(new TaskL("12", " Bi"));
        oi.add(new TaskL("2", " UF"));
        oi.add(new TaskL("2", " UF"));
        oi.add(new TaskL("2", " UF"));
        order.find(oi);
        System.out.println(order.find(oi));
    }
}
