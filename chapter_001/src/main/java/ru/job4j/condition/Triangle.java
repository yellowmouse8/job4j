package ru.job4j.condition;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point a, Point b, Point c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }

    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);

        if (exist(a, b, c)) {

            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }

    public boolean exist(double a, double b, double c) {
        return a != 0 && b != 0 && c != 0;
    }
}