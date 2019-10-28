package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void whenFound5() {
        int[] imput = new int[]{1, 3, 4, 5, 6, 8};
        int value = 5;
        int result = FindLoop.indexOf(imput, value);
        int expected = 3;
        assertThat(result, is(expected));
    }

    @Test
    public void notFound10() {
        int[] imput = new int[]{2, 4, 5, 6, 821, 24};
        int value = 10;
        int result = FindLoop.indexOf(imput, value);
        int expected = -1;
        assertThat(result, is(expected));
    }

    @Test
    public void whenFound4startToFinish() {
        int[] imput = new int[]{1, 2, 3, 4, 10, 12};
        int value = 4;
        int start = 1;
        int finish = 6;
        int result = FindLoop.indexOf(imput, value, start, finish);
        int expected = 3;
        assertThat(result, is(expected));
    }

    @Test
    public void whenNotFound12startToFinish() {
        int[] imput = new int[]{1, 2, 4, 5, 6, 8, 90};
        int value = 12;
        int start = 2;
        int finish = 6;
        int result = FindLoop.indexOf(imput, value, start, finish);
        int expected = -1;
        assertThat(result, is(expected));
    }
}