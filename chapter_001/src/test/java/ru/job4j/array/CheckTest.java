package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {
    @Test
    public void checkWhenTruethenFalse() {
        Check check = new Check();
        boolean[] imput = new boolean[]{true, true, false, false};
        boolean result = check.mono(imput);
        assertThat(result, is(false));
    }

    @Test
    public void checkWhenTruebyTrue() {
        Check check = new Check();
        boolean[] imput = new boolean[]{true, true, true, true};
        boolean result = check.mono(imput);
        assertThat(result, is(true));
    }

    @Test
    public void checkWhenFalsebyFalse() {
        Check check = new Check();
        boolean[] imput = new boolean[]{false, false, false, false, false, false};
        boolean result = check.mono(imput);
        assertThat(result, is(true));
    }
}
