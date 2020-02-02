package ru.job4j.search;

import java.util.LinkedList;
import java.util.List;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        var size = tasks.size();
        for (var index = 0; index != tasks.size(); index++) {
            if (task.getPriority() < tasks.get(index).getPriority()) {
                size = tasks.indexOf(tasks.get(index));
                break;
            }
        } tasks.add(size, task);
    }


    public Task take() {
        return tasks.poll();
    }
}

