package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


public class ConvertMatrix2ListTest {
    @Test
    public void when2MassiveOn2ArrayThen() {
        ConvertMatrix2List list = new ConvertMatrix2List();
        int[][] input = {{1, 2, 3},
                {4, 5, 6, 7}};
        List<Integer> expect = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> result = list.toList(input);
        assertThat(result, is(expect));
    }

    @Test
    public void when3Massive() {
        ConvertMatrix2List list = new ConvertMatrix2List();
        int[][] input = {{1, 3, 4, 5},
                {5, 6, 7, 8},
                {4, 5, 6, 7}};
        List<Integer> result = list.toList(input);
        List<Integer> expect = Arrays.asList(1, 3, 4, 5, 5, 6, 7, 8, 4, 5, 6, 7);
        assertThat(result, is(expect));
    }
}
