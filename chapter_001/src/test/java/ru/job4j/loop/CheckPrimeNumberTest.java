package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.both;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {
    @Test
    public void Proverka10 (){
        CheckPrimeNumber log= new CheckPrimeNumber();
        boolean expected=true;
        boolean rsl =log.check(6);
        assertThat(rsl, is(expected));
    }
    @Test
    public void proverka11(){
        CheckPrimeNumber log= new CheckPrimeNumber();
        boolean expected =true;
        boolean rsl= log.check(11);
        assertThat(rsl, is(expected));
    }
    @Test
    public void proverka7(){
        CheckPrimeNumber log= new CheckPrimeNumber();
        boolean expected=true;
        boolean rsl= log.check(7);
        assertThat(rsl, is(expected));
    }
}