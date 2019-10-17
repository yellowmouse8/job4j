package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void chyot(){
        Turn turn=new Turn();
        int [] imput=new int[]{2,4,6,8,10,12,14};
        int [] result=turn.back(imput);
        int [] expected= new int []{14,12,10,8,6,4,2};
        assertThat(result,is(expected));
    }
    @Test
    public void neChyot(){
        Turn turn=new Turn();
        int [] imput= new int[]{1,3,5,7,9,43,51,123,125};
        int [] result=turn.back(imput);
        int[] expected=new int[]{125,123,51,43,9,7,5,3,1};
        assertThat(result,is(expected));
    }
}
