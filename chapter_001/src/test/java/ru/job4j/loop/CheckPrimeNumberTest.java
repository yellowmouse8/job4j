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
        boolean rsl =log.check(15);
        assertThat(rsl, is(expected));
    }
    @Test
    public void proverka4(){
        CheckPrimeNumber log= new CheckPrimeNumber();
        boolean expected =false;
        boolean rsl= log.check(4);
        assertThat(rsl, is(expected));
    }
    @Test
    public void proverka5(){
        CheckPrimeNumber log= new CheckPrimeNumber();
        boolean expected=true;
        boolean rsl= log.check(5);
        assertThat(rsl, is(expected));
    }
}
