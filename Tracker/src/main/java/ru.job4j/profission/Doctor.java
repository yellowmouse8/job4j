package ru.job4j.profission;

public class Doctor extends Profession {
    public Doctor(String name, String surname, String education, double birthday) {
        super(name, surname, education, birthday);
    }

    public Dentist dent(Anesthetist anesthetist) {
        return anesthetist;
    }
}
