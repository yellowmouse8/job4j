package ru.job4j.collection;

import org.hamcrest.Matcher;
import org.hamcrest.text.StringContainsInOrder;
import org.junit.Test;
import ru.job4j.comparator.StringCompare;

import java.util.HashSet;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class StringCompareTest {
    @Test
    public void whenStringEqZero() {
        StringCompare st = new StringCompare();
        int rsl = st.compare("Ivanov", "Ivanov");
        assertThat(rsl, is(0));
    }

    @Test
    public void whenLeftLessRight() {
        StringCompare st = new StringCompare();
        int rst = st.compare("Ivanov", "Ivanova");
        assertThat(rst, lessThan(0));
    }

    @Test
    public void whenLeftGreaterRight() {
        StringCompare st = new StringCompare();
        int rst = st.compare("Petrov", "Ivanova");
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void secondCharLeftGreaterThanRight() {
        StringCompare st = new StringCompare();
        int rst = st.compare("Petrov", "Patrov");
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void secondCharLeftLessThanRight() {
        StringCompare st = new StringCompare();
        int rst = st.compare("Patrova", "Petrov");
        assertThat(rst, lessThan(0));
    }
}
