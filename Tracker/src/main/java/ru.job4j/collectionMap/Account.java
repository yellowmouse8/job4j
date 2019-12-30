package ru.job4j.collectionmap;

public class Account {
    private double value;
    private String requisites;

    public Account(String requisites, double money) {
        this.requisites = requisites;
        this.value = money;
    }

    public String getRequisites() {
        return this.requisites;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
