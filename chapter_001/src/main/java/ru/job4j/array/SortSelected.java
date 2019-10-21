package ru.job4j.array;


public class SortSelected {

    public static int[] sort(int[] data) {
        for (int index = data.length - 1; index > 0; index--) {
            for (int index2 = 0; index2 != index; index2++) {
                if (data[index2] > data[index2 + 1]) {
                    int tmp = data[index2];
                    data[index2] = data[index2 + 1];
                    data[index2 + 1] = tmp;
                }
            }
        }

        return data;
    }
}
