package ru.job4j.collectiontreeset;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class UserL implements Comparable<UserL> {
    private String name;
    private int age;

    public UserL(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "UserL{"
                + "name='" + name + '\''
                + ", age=" + age
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
        UserL userL = (UserL) o;
        return Objects.equals(age, userL.age)
                && Objects.equals(name, userL.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(@NotNull UserL o) {
        return Integer.compare(age, o.age);
    }
}
