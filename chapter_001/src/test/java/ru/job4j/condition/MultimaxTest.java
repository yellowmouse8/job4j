package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultimaxTest {
    @Test
    public void ThirdAll() {
        MultiMax check = new MultiMax();
        int result = check.max(3,4,6);
        Assert.assertThat(result, is(6));
    }
    @Test
    public void firstMax(){
        MultiMax check = new MultiMax();
        int result = check.max(10, 6, 9);
        Assert.assertThat(result, is(10));
    }
    @Test
    public void secondMax(){
        MultiMax check= new MultiMax();
        int result = check.max(2,64, 44);
        Assert.assertThat(result, is(64));
    }
    @Test
    public void AllnumbersSame(){
        MultiMax check= new MultiMax();
        int result= check.max(10,10,10);
        Assert.assertThat(result, is(10));
    }
}
