package ru.job4j.collectionmap;

import java.util.Objects;

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

    public void setRequisites(String name) {
        this.requisites = requisites;
    }

    @Override
    public String toString() {
        return "Account{"
                + "value=" + value
                + ", requisites='" + requisites + '\''
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Double.compare(account.value, value) == 0
                && Objects.equals(requisites, account.requisites);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, requisites);
    }

    void transfer(Account target, double amount) {
        if (this.value >= amount && amount > 0) {
            this.value -= amount;
            target.setValue(target.getValue() + amount);
        }
    }
}
