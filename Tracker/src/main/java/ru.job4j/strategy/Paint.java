package ru.job4j.strategy;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Paint {
    public void draw  (Shape shape){
        System.out.println(shape.draw());



    }
    public static void main (String[]args){
    Fabriq figureFab = new AbstFactory().createFabriq("figure");
        Fabriq shapeFab = new AbstFactory().createFabriq("shape");
        Shape square = shapeFab.createShape("square");
        Figure line = figureFab.createFigure("arrow");
        square.draw();
        line.draw();
    }

}
