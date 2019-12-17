package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task>  tasks = new LinkedList<>();

    public void put(Task task) {
        if (tasks.size() == 0) {
            tasks.add(0, task);
        } else {
            for (Task element : tasks) {
                if (task.getPriority() < tasks.element().getPriority()) {
                    tasks.add(0, task);
                    break;
                }
            }
        }
    }

    public Task take() {
        return tasks.remove(0);
    }
}

