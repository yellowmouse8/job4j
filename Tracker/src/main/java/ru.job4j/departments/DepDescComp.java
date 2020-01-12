package ru.job4j.departments;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int i = o1.length() - o2.length();
        for (int index = 0; index != o1.length() && index != o2.length(); index++) {
            i = Character.compare(o2.charAt(index), o1.charAt(index));
            if (i != 0) {
                break;
            }
        }
        return i;
    }
}
