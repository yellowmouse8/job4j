package ru.job4j.profission;

public class Dentist extends Doctor {
    private String teeth;

    public Dentist(String name, String surname, String education, double birthday, String teeth) {
        super(name, surname, education, birthday);
    }

    public void setTeeth(String teeth) {
        this.teeth = teeth;
    }

    public String getTeeth() {
        return teeth;
    }
}
