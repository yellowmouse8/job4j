package ru.job4j.grouping;

import java.util.Set;

public class StudentGroup {
    private String name;
    private Set<String> units;

    public StudentGroup(String name, Set<String> units) {
        this.name = name;
        this.units = units;
    }

    public Set<String> getUnits() {
        return units;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "StudentGroup{"
                + "name='" + name + '\''
                + ", units=" + units
                + '}';
    }
}
