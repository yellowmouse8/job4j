package ru.job4j.strategy;

public class Triangle implements Shape {

    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("   O   ");
        pic.append("  OOO  ");
        pic.append(" OOOOO ");
        pic.append("OOOOOOO");
        return pic.toString();
    }
}
