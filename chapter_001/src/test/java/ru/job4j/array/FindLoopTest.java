package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void whenArray5then0() {
        FindLoop find = new FindLoop();
        int[] imput = new int[]{3, 10, 10, 5};
        int value = 5;
        int result = find.indexOf(imput, value);
        int expected = 3;
        assertThat(result, is(expected));
    }

    @Test
    public void whenArray12thenNull() {
        FindLoop find = new FindLoop();
        int imput[] = new int[]{1, 3, 6, 10};
        int value = 5;
        int result = find.indexOf(imput, value);
        int expected = -1;
        assertThat(result, is(expected));
    }
}
