package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double result = distance(1, 2, 6, 6);
        System.out.println(" Результат точек в системе координат (6-1) и (6-2) это " + result);
    }
}
