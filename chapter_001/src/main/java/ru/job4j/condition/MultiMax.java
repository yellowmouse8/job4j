package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result0 = first > second ? first : second;
        int result = result0 > third ? result0 : third;
        return result;
    }
}
