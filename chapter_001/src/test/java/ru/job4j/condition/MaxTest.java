package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void chtobolshe() {
        int result = Max.max(300, 770, 544);
        assertThat(result, is(770));
    }

    @Test
    public void leftbolshe() {
        int left = Max.max(600, 232, 412, 775);
        assertThat(left, is(775));
    }

    @Test
    public void rightBolshe() {
        int right = Max.max(5654, 12240);
        assertThat(right, is(12240));
    }
}
