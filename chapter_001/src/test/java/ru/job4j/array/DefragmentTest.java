package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DefragmentTest {
    @Test
    public void whenNullNotFirst (){
        String [] imput = { " I ", null, " wanna " , null, " be ", null, " compressed "};
        String [] compressed = Defragment.compress(imput);
        String [] expected = { " I ",  " wanna " , " be ", " compressed " ,null,null,null, };
        assertThat(compressed,is(expected));
    }
    @Test
    public void whenNullFirst (){
        String[] imput = {null, " I ", null,  " wanna " ,null, " be ", " compressed " };
        String[] compressed= Defragment.compress(imput);
        String[] expected = { " I ",  " wanna " , " be ", " compressed " ,null,null,null, };
    }
}
