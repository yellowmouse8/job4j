package ru.job4j.loop;

public class Factorial {
    public  int calc(int n) {
        int result = 0;
        int y = 1;
        for (int x = 1; x <= n; x++) {
            y = y * x;
        }
        result = y;
        return result;
    }
}
