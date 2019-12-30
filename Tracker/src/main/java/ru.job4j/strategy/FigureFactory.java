package ru.job4j.strategy;

public class FigureFactory implements Fabriq {
    @Override
    public Figure createFigure(String type) {
        Figure figure = null;
        if ("arrow".equals(type)) {
            figure = new LIne();
        } else if ("circle".equals(type)) {
            figure = new Circle();
        }
        return figure;
    }

    @Override
    public Shape createShape(String type) {
        return null;
    }

}
