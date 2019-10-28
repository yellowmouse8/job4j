package ru.job4j.condition;

public class Driver {
    private char license = 'N';

    public void SdalPrava(char category) {
        this.license = category;
    }

    public boolean Vibor() {
        return this.license == 'A' || this.license == 'B' || this.license == 'C';
    }

    public boolean Prava(char category) {
        return this.license == category;
    }
}
