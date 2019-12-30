package ru.job4j.strategy;

public class AbstFactory {
    public Fabriq createFabriq(String typeFabr) {
        Fabriq fabriq = null;
        if ("shape".equals(typeFabr)) {
            fabriq = new ShapeFactory();
        } else if ("figure".equals(typeFabr)) {
            fabriq = new FigureFactory();
        }
        return fabriq;
    }
}
