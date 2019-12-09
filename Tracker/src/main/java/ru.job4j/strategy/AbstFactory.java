package ru.job4j.strategy;

public class AbstFactory {
    public Fabriq createFabriq (String typeFabriq){
        Fabriq fabriq = null;
        if ("figure".equals(typeFabriq)){
            fabriq = new FigureFactory();
        }else if ("shape".equals(typeFabriq)){
            fabriq = new ShapeFactory();
        }
        return fabriq;
    }
}
