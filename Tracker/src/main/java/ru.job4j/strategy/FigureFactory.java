package ru.job4j.strategy;

public class FigureFactory implements Fabriq {
    public Figure createFigure (String name){
        Figure figure = null;
        if ("circle".equals(name)){
            figure = new Circle();
        }else if ("arrow".equals(name)){
            figure = new LIne();
        }
        return figure;
    }
    @Override
    public Shape createShape(String typeShape){
        return null;
    }
}
