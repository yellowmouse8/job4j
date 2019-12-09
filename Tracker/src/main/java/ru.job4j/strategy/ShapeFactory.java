package ru.job4j.strategy;

    public class ShapeFactory implements Fabriq {

        public Shape createShape (String name){
            Shape shape = null;
            if ("triangle".equals(name)){
                shape = new Triangle();
            }else if ("square".equals(name)){
                shape = new Square();
            }
            return shape;
        }

        @Override
        public Figure createFigure(String typeFigure) {
            return null;
        }
    }
