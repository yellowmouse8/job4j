package ru.job4j.loop;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void summaVsex (){
        Counter log=new Counter();
        int expected =110;
        int result=log.add(1,20);
        Assert.assertThat(result, is(expected));
    }
}
