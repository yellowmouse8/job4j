package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int up) {
        return max(left, max(right, up));
    }

    public static int max(int left, int right, int up, int down) {
        return max(left, right, max(down, up));
    }
}
