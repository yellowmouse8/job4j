package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {
    @Test
    public void whenTableIs9() {
        Mattrix mattrix = new Mattrix();
        int[][] table = mattrix.multiple(3);
        int[][] expected = new int[][]{
                {1, 2, 3},
                {2, 4, 6},
                {3, 6, 9}
        };
        assertThat(table, is(expected));
    }
}
