package ru.job4j.profission;

public class Profession {
    public String name;
    public String surname;
    public String education;
    public double birthday;

    public Profession(String name, String surname, String education, double birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getBirthday() {
        return birthday;
    }

    public String getEducation() {
        return education;
    }
}
