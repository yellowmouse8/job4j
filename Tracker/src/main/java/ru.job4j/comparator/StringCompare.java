package ru.job4j.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = 0;
        int rsl = 0;
        char[] charL = left.toCharArray();
        char[] charR = right.toCharArray();
        if (left.length() > right.length()) {
            rsl = -1;
        } else if (charR.length > charL.length) {
            rsl = +1;
        } else {
                for (int index = 0; index != charL.length; index++) {
                    result = result + Character.compare(charL[index], charR[index]);
                }
                rsl = Integer.compare(result, 0);
        }
        return rsl;
    }
}