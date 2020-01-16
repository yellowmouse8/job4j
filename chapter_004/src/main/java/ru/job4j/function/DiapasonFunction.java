package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class DiapasonFunction {
    List<Double> diapason(int start, int finish, Function<Double, Double> op) {
        List<Double> result = new ArrayList<>();
        for (double i = start; i != finish; i++) {
            result.add(op.apply(i));
        }
        return result;
    }
}
