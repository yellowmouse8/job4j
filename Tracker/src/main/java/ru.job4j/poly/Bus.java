package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public String drive() {
        return null;
    }

    @Override
    public int passengers() {
        return 0;
    }

    @Override
    public int fuel(double price) {
        return 0;
    }
}
