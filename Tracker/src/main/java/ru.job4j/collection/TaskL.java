package ru.job4j.collection;

import java.util.Objects;

public class TaskL {
    private String number;
    private String description;

    public TaskL(String number, String description) {
        this.number = number;
        this.description = description;
    }

    @Override
    public String toString() {
        return "TaskL{"
                + "number='" + number + '\''
                + ", description='" + description + '\''
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskL taskL = (TaskL) o;
        return Objects.equals(number, taskL.number)
                && Objects.equals(description, taskL.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, description);
    }

    public String getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }
}
