package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MortgageTest {
    @Test
    public void credit50() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(120, 70, 50);
        assertThat(year, is(4));
    }

    @Test
    public void credit25() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(170, 90, 25);
        assertThat(year, is(2));
    }

    @Test
    public void amerikanskyCredit3n5() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(52300, 26053, 3.7);
        assertThat(year, is(2));
    }
}
