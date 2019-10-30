package ru.job4j.condition;

public class Driver {
    private char license = 'N';

    public void sdalPrava(char category) {
        this.license = category;
    }

    public boolean vibor() {
        return this.license == 'A' || this.license == 'B' || this.license == 'C';
    }

    public boolean prava(char category) {
        return this.license == category;
    }
}
