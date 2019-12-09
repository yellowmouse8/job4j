package ru.job4j.strategy;

public class Circle implements Figure {
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("    0100    ");
        pic.append(System.lineSeparator());
        pic.append("  00011000  ");
        pic.append(System.lineSeparator());
        pic.append(" 0010101000 ");
        pic.append(System.lineSeparator());
        pic.append("  00101000  ");
        pic.append(System.lineSeparator());
        pic.append("   101010   ");
        pic.append(System.lineSeparator());
        return pic.toString();
    }
}
