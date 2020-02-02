package ru.job4j.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ConvertList2Array {
    int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int row = 0, cell = 0;
        for (Integer num : list) {
            array[row][cell] = num;
            cell++;
            if (cell == groups) {
                row++;
                cell = 0;
            }
        }
        return array;
    }

    public List<Integer> convert(List<int[]> list) {
        List<Integer> result = new ArrayList<>();
        for (int[] tmp : list) {
            for (int i : tmp) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ConvertList2Array op = new ConvertList2Array();
        List<int[]> list = List.of(new int[]{1, 2, 3, 4}, new int[]{4, 5, 6, 7, 7});
        System.out.println(op.convert(list));
    }
}
