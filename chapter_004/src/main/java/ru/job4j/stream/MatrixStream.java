package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MatrixStream {
    /*
    List<Integer> flatMapConvert(List<List<Integer>> list ){
        return list.stream().flatMap(List::stream).collect(Collectors.toList());
    }
     */
    List<Integer> flatMapConvert(Integer[][] convert) {
        return Arrays.stream(convert).flatMap(Arrays::stream).collect(Collectors.toList());
    }
}
