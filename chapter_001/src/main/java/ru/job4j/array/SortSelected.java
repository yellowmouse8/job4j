package ru.job4j.array;


public class SortSelected {

    public static int[] sort(int[] data) {
        for (int index = 0; index < data.length; index++) {
            int min = index;
            for (int index2 = index + 1; index2 < data.length; index2++) {
                if (data[index2] < data[min]) {
                    min = index2;
                }
            }
            int tmp = data[min];
            data[min] = data[index];
            data[index] = tmp;
        }
        return data;
    }
}
