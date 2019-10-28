package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {
    @Test
    public void whenStartsWithPrefix() {
        char[] word = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] pref = new char[]{'H', 'e', 'l'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStatsWithPrefix() {
        char[] word = new char[]{'H', 'e', 'e', 'l', 'o'};
        char[] pref = new char[]{'H', 'a'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }
}
