package ru.job4j.profission;

public class Engineer extends Profession {

    public Engineer(String name, String surname, String education, double birthday) {
        super(name, surname, education, birthday);
    }

    public Programmer pe(Development work) {
        return work;
    }
}
