package ru.job4j.strategy;

public class Square implements Shape {
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("10010101010");
        pic.append(System.lineSeparator());
        pic.append("0         1");
        pic.append(System.lineSeparator());
        pic.append("0         0");
        pic.append(System.lineSeparator());
        pic.append("1         0");
        pic.append(System.lineSeparator());
        pic.append("01010101010");
        pic.append(System.lineSeparator());
        return pic.toString();
    }
}
