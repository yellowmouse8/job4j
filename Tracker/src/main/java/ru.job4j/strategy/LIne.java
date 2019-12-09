package ru.job4j.strategy;

public class LIne implements Figure {
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("     1     ");
        pic.append(System.lineSeparator());
        pic.append("    0111    ");
        pic.append(System.lineSeparator());
        pic.append("   101010   ");
        pic.append(System.lineSeparator());
        pic.append("     11     ");
        pic.append(System.lineSeparator());
        pic.append("     11     ");
        pic.append(System.lineSeparator());
        return pic.toString();
    }
}
