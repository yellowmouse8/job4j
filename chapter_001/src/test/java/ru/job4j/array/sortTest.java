package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class sortTest {
    @Test
    public void findMinAndMax() {
        int[] index = new int[]{22, 34, 5, 55, 23, 46, 7, 2, 10,};
        int [] result = SortSelected.sort(index);
        int [] expected = new int[]{2,5,7,10,22,23,34,46,55};
        assertThat(result, is(expected));
    }
}
