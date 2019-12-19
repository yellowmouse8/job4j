package ru.job4j.search;

import java.util.LinkedList;
import java.util.List;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        if (tasks.size() > 0) {
            for (int index = 0; index != tasks.size(); index++) {
                if (task.getPriority() < tasks.get(index).getPriority()) {
                    tasks.add(index, task);
                    break;
                } else if (task.getPriority() == tasks.get(index).getPriority()) {
                    tasks.add(index + 1, task);
                    break;
                }
                if (index == tasks.size() - 1) {
                    tasks.add(task);
                    break;
                }
            }
        } else {
            tasks.add(task);
        }
    }

    public Task take() {
        return tasks.poll();
    }
}

