package ru.job4j.array;

public class Mattrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int index = 0; index < size; index++) {
            for (int index2 = 0; index2 < size; index2++) {
                table[index][index2] = (index + 1) * (index2 + 1);
            }
        }
        return table;
    }
}
