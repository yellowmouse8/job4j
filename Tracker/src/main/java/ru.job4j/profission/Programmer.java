package ru.job4j.profission;

public class Programmer extends Engineer {
    public double workHours;

    public Programmer(String name, String surname, String education, double birthday) {
        super(name, surname, education, birthday);
    }

    public Programmer(String name, String surname, String education, double birthday, double workHours) {
        super(name, surname, education, birthday);
        this.workHours = workHours;
    }

    public double getWorkHours() {
        return workHours;
    }
}
