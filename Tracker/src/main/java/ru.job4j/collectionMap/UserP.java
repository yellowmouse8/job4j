package ru.job4j.collectionmap;


import ru.job4j.collection.User;

import java.util.Objects;

public class UserP implements Comparable<UserP> {
    private String name;
    private String passport;

    public UserP(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public String getPassport() {
        return passport;
    }

    public boolean equals(UserP compareUserP) {
        return this.passport.equals(compareUserP.passport);
    }

    public boolean equals(String passport) {
        return this.passport.equals(passport);
    }

    @Override
    public int hashCode() {
        return this.passport.hashCode();
    }

    @Override
    public int compareTo(UserP o) {
        return this.passport.compareTo(o.passport);
    }
}
