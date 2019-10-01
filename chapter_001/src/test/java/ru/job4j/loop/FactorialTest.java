package ru.job4j.loop;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class FactorialTest {
    @Test
    public void factoriail5(){
        Factorial log=new Factorial();
        int expected=6;
        int result= log.calc(3);
        Assert.assertThat(result, is(expected));
    }
    @Test
    public void test2(){
        Factorial log=new Factorial();
        int expected= 120;
        int result= log.calc(5);
        Assert.assertThat(result, is(expected));
    }
}
