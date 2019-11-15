package ru.job4j.condition;

import org.junit.Test;

import java.io.PipedOutputStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void distanceTest3d() {
        Point a = new Point(4, 3, 7);
        Point b = new Point(6, 4, 9);
        double expected = 3.0;
        double result = a.distance3d(b);
        assertThat(result, is(expected));
    }

    @Test
    public void distance3dM() {
        Point a = new Point(112, 37, 45);
        Point b = new Point(110, 26, 102);
        double expected = 58.08614292583042;
        double result = a.distance3d(b);
        assertThat(result, is(expected));
    }

    @Test
    public void distanceTest2d() {
        Point a = new Point(6, 2);
        Point b = new Point(6, 4);
        double expected = 2.0;
        double result = a.distance3d(b);
        assertThat(result, is(expected));
    }
}
