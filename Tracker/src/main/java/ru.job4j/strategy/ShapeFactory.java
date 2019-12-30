package ru.job4j.strategy;

public class ShapeFactory implements Fabriq {
    public Shape createShape(String type) {
        Shape shape = null;
        if ("triangle".equals(type)) {
            shape = new Triangle();
        } else if ("square".equals(type)) {
            shape = new Square();
        }
        return shape;
    }

    @Override
    public Figure createFigure(String typeOfFi) {
        return null;
    }
}
