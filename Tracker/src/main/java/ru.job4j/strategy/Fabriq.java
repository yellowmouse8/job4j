package ru.job4j.strategy;

public interface Fabriq {
    Shape createShape(String typeShape);
    Figure createFigure(String typeFigure);
}
