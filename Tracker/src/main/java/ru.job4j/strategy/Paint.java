package ru.job4j.strategy;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.file.attribute.AttributeView;

public class Paint {
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    public void drawF(Figure figure) {
        System.out.println(figure.draw());
    }

    public static void main(String[] args) {
        Fabriq shape = new AbstFactory().createFabriq("shape");
        Shape square = shape.createShape("square");
        Paint paint = new Paint();
        paint.draw(square);
        Fabriq figure = new AbstFactory().createFabriq("figure");
        Figure circle = figure.createFigure("circle");
        paint.drawF(circle);
    }
}