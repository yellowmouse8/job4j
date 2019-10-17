package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        for (int index = 0; index < array.length; index++) {
            int n = array.length;
            int tmp = array[0];
            int tmp2=array[1];
            array[0] = array[n - 1];
            array[1]=array[n-2];
            array[n-2]=tmp2;
            array[n - 1] = tmp;

        }
        return array;
    }
}
