package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void whenBound3is149(){
        int bound=3;
        Square square=new Square();
        int[]rst=square.calculate(bound);
        int[] expected=new int[]{1,4,9};
        assertThat(rst, is(expected));
    }
    @Test
    public void whenBound5is1491625(){
        Square square=new Square();
        int[]rst=square.calculate(5);
        int []expected=new int[]{1,4,9,16,25};
        assertThat(rst,is(expected));
    }
    @Test
    public void whenBound6is149plus(){
        Square square=new Square();
        int[]rst=square.calculate(6);
        int[]expected=new int[]{1,4,9,16,25,36};
        assertThat(rst,is(expected));
    }
    @Test
    public void whenBound7is149plusPlus(){
        Square square=new Square();
        int[]rst=square.calculate(7);
        int[]expected= new int[]{1,4,9,16,25,36,49};
        assertThat(rst,is(expected));
    }
}
