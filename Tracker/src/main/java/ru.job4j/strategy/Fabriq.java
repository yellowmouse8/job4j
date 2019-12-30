package ru.job4j.strategy;

public interface Fabriq {
    Shape createShape(String typeOfSh);
    Figure createFigure(String typeOfFi);
}
