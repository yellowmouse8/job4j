package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@Ignore
public class TriangleTest {
    @Test
    public void kogdaSushestvuet() {
        boolean result = Triangle.exist(3 + 3, 3, 8);
        Assert.assertThat(result, is(true));
    }

    @Test
    public void kogdanesushestvuet() {
        boolean result = Triangle.exist(0.0, 0.0, 0.0);
        Assert.assertThat(result, is(false));
    }
}
