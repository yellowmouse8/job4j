package ru.job4j.profission;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private double birthday;

    public Profession(String name, String surname, String education, double birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setBirthday(double brithday) {
        this.birthday = birthday;
    }

    public double getBirthday() {
        return birthday;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEducation() {
        return education;
    }
}
