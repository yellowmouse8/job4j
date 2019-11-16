package ru.job4j.profission;

public class Development extends Programmer {
    private String development;

    public Development(String name, String surname, String education, double birthday, String development) {
        super(name, surname, education, birthday);
    }

    public void setDevelopment(String development) {
        this.development = development;
    }

    public String getDevelopment() {
        return development;
    }
}
