package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PrimeNumberTest {
    @Test
    public void when5(){
        PrimeNumber prime=new PrimeNumber();
        int count = prime.isPrimeUp(11);
        assertThat(count,is(5));
    }
}
