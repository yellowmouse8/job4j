package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class sQqMaxTest {
    @Test
    public void maxAll() {
        int first = 12;
        int second = 15;
        int third = 5;
        int forth = 2;
        int expected = 15;
        int result = sQqMax.max(first, second, third, forth);
        assertThat(result, is(expected));
    }

}

