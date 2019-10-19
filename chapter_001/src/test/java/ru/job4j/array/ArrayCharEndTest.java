package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ArrayCharEndTest {
    @Test
    public void endsCharsTrue(){
        char [] word= new char[]{'I','n','v','i','s','i','b','l','e'};
        char[] post=new char[]{'b','l' ,'e'};
        boolean result= ArrayEnds.endsWith(word,post);
        assertThat(result,is(true));
    }
    @Test
    public void endCharsFalse(){
        char [] word= new char[]{'M','a','n','d','a','l','o','r'};
        char[] post= new char[]{'a','s','s'};
        boolean result=ArrayEnds.endsWith(word,post);
        assertThat(result,is(false));
    }
}
