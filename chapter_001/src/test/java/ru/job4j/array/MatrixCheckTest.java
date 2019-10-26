package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class MatrixCheckTest {
    @Test
    public void whenNotTrue (){
        char [][] imput= new char[][]{
                {'_','X','_','_','_'},
                {'_','X','_','_','_'},
                {'_','X','_','_','_'},
                {'_','_','X','_','_'},
                {'_','X','_','_','_'},

        };
        boolean result= MatrixCheck.isWin(imput);
        assertThat(result,is(false));
    }
    @Test
    public void whenTrue (){
        char [][] imput=new char[][]{
                {'_','X','_','_','_'},
                {'_','X','_','_','_'},
                {'_','X','_','_','_'},
                {'_','X','_','_','_'},
                {'_','X','_','_','_'},
        };
        boolean result= MatrixCheck.isWin(imput);
        assertThat(result,is(true));
    }
}
