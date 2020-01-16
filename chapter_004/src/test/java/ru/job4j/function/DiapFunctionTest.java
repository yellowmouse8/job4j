package ru.job4j.function;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DiapFunctionTest {
    @Test
    public void whenLineFunction() {
        DiapasonFunction dp = new DiapasonFunction();
        List<Double> result = dp.diapason(2, 5, x -> x * 2 + 3);
        List<Double> expect = new ArrayList<>(Arrays.asList(7.0, 9.0, 11.0));
        assertThat(result, is(expect));
    }

    @Test
    public void whenSquareFunction() {
        DiapasonFunction dp = new DiapasonFunction();
        List<Double> result = dp.diapason(4, 7, x -> ((x * x) + 2));
        List<Double> expected = new ArrayList<>(Arrays.asList(18D, 27D, 38D));
        assertThat(result, is(expected));
    }

    @Test
    public void whenLogFunction() {
        DiapasonFunction dp = new DiapasonFunction();
        List<Double> result = dp.diapason(3, 6, Math::log);
        List<Double> expected = new ArrayList<>(Arrays.asList(1.0986122886681098, 1.3862943611198906, 1.6094379124341003));
        assertThat(result, is(expected));
    }
}
