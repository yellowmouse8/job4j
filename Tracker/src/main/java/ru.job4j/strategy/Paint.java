package ru.job4j.strategy;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Paint {
    public void draw  (Shape shape){
        System.out.println(shape.draw());



    }
    public static void main (String[]args){
        Paint triangle = new Paint();
        Paint square = new Paint();
        triangle.draw(new Triangle());
        square.draw(new Square());

    }

}
