package ru.job4j.sort;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class CoffeeMachineTest {
    @Test
    public void whenEquals() {
        Machine machine = new Machine();
        int[] expected = new int[]{};
        int[] rsl = machine.change(100, 100);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when100by24() {
        Machine machine = new Machine();
        int[] rsl = machine.change(100, 24);
        int[] expected = new int[]{10, 10, 10, 10, 10, 10, 10, 5, 1};
        assertThat(rsl, is(expected));
    }
}
