package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class MatrixTest {
    @Test
    public void testMatrixConvert() {
        MatrixStream matrixStream = new MatrixStream();
        Integer[][] nums = {{1, 2, 3}, {4, 5, 6}};
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6);
        assertThat(matrixStream.flatMapConvert(nums), is(expected));
    }
}
