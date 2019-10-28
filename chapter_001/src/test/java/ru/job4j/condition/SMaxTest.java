package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SMaxTest {
    @Test
    public void maxall2() {
        int expected = 20;
        int result = SMax.max(20, 16, 15, 2);
        assertThat(result, is(expected));
    }

}

