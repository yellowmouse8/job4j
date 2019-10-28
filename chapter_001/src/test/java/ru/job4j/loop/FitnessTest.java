package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FitnessTest {
    @Test
    public void ivanBolshe() {
        Fitness fit = new Fitness();
        int expected = 0;
        int month = fit.calc(110, 100);
        assertThat(month, is(expected));
    }

    @Test
    public void ivanMenshe() {
        Fitness fit = new Fitness();
        int expected = 2;
        int month = fit.calc(60, 100);
        assertThat(month, is(expected));
    }

    @Test
    public void ivanMenshe2() {
        Fitness fit = new Fitness();
        int expected = 4;
        int month = fit.calc(20, 100);
        assertThat(month, is(expected));
    }
}
