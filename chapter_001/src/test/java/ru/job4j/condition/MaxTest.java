package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void Chtobolshe() {
        int result = Max.max(300, 600);
        assertThat(result, is(600));
    }

    @Test
    public void Leftbolshe() {
        int left = Max.max(600, 232);
        assertThat(left, is(600));
    }

    @Test
    public void RightBolshe() {
        int right = Max.max(5654, 12240);
        assertThat(right, is(12240));
    }
}
