package ru.job4j.strategy;

public class Triangle implements Shape {

    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("     1     ");
        pic.append(System.lineSeparator());
        pic.append("    011     ");
        pic.append(System.lineSeparator());
        pic.append("   101010   ");
        pic.append(System.lineSeparator());
        pic.append(" 010101010  ");
        pic.append(System.lineSeparator());
        pic.append("000101010101");
        pic.append(System.lineSeparator());
        return pic.toString();
    }

}
