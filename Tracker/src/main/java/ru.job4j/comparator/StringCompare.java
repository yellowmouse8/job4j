package ru.job4j.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rst = 0;
        for (int index = 0; index != left.length() && index != right.length(); index++){
            rst = Character.compare(left.charAt(index), right.charAt(index));
            if (rst != 0){
                break;
            }
        }
        return rst != 0? rst : Integer.compare(left.length(), right.length());
    }
}