package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int length = array.length;
            int tmp = array[index];
            array[index] = array[length - index - 1];
            array[length - index - 1] = tmp;
        }
        return array;
    }
}
