package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int n = array.length;
            int tmp = array[index];
            array[index] = array[n - index - 1];
            array[n - index - 1] = tmp;

        }
        return array;
    }
}
