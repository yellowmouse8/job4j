package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class sqAreaTest {
    @Test
    public void when4k1s1() {
        int k = 1;
        int p = 4;
        int expected = 1;
        int s = SqArea.square(p, k);
        assertThat(s, is(expected));
    }

    @Test
    public void when6k2s2() {
        int k = 2;
        int p = 6;
        int expected = 2;
        int s = SqArea.square(p, k);
        assertThat(s, is(expected));
    }
}
