package ru.job4j.sort;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MergeTest {
    @Test
    public void whenBothEmpty() {
        Merge algo = new Merge();
        int[] expected = new int[0];
        int[] result = algo.merge(new int[0], new int[0]);
        assertThat(result, is(expected));
    }

    @Test
    public void whenBothSame() {
        Merge algo = new Merge();
        int[] expected = new int[]{1, 2, 3, 4};
        int[] result = algo.merge(new int[]{1, 2}, new int[]{3, 4});
        assertThat(result, is(expected));
    }

    @Test
    public void whenLeftLess() {
        Merge algo = new Merge();
        int[] expected = new int[]{1, 2, 3, 4, 5, 6};
        int[] result = algo.merge(new int[]{1, 2}, new int[]{3, 4, 5, 6});
        assertThat(result, is(expected));
    }

    @Test
    public void whenLeftGreat() {
        Merge algo = new Merge();
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] result = algo.merge(new int[]{1, 2, 3, 4, 5}, new int[]{6, 7});
        assertThat(result, is(expected));
    }

    @Test
    public void whenLeftIsEmpty() {
        Merge algo = new Merge();
        int[] expected = new int[]{1, 2, 3, 4, 5};
        int[] result = algo.merge(new int[]{}, new int[]{1, 2, 3, 4, 5});
        assertThat(result, is(expected));
    }
}
