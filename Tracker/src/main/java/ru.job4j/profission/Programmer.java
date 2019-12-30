package ru.job4j.profission;

public class Programmer extends Engineer {
    private double workHours;

    public Programmer(String name, String surname, String education, double birthday) {
        super(name, surname, education, birthday);
    }

    public Programmer(String name, String surname, String education, double birthday, double workHours) {
        super(name, surname, education, birthday);
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public double getWorkHours() {
        return workHours;
    }
}
