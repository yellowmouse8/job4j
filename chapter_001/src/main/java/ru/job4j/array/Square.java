package ru.job4j.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int index = 0; index != bound; index++) {

            rst[index] = (index + 1) * (index + 1);

        }
        return rst;
    }
}
