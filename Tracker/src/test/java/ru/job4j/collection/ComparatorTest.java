package ru.job4j.collection;
import org.junit.Test;
import ru.job4j.comparator.*;

import java.util.Comparator;
import java.util.Iterator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class ComparatorTest {
    @Test
    public void whenNameAndPriorityDescription (){
        Comparator <UserCom> comp = new NameEndComp().thenComparing(new PriorityEndComp());
        int rsl = comp.compare(
                new UserCom("Vi", 0),
                new UserCom("Bi", 1));
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenNameAndPriorityBeginning (){
        Comparator <UserCom> comp = new NameBeginComp().thenComparing(new PriorityBeginComp());
        int rsl = comp.compare(new UserCom("Ub" , 0), new UserCom("Di", 1));
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void whenNameBegin (){
        Comparator <UserCom> comp = new NameBeginComp();
        int rsl = comp.compare(new UserCom("Ub" , 0), new UserCom("Di", 1));
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void whenPriorityBegin (){
        Comparator <UserCom> comp = new PriorityBeginComp();
        int rsl = comp.compare(new UserCom("Ub" , 1), new UserCom("Di", 0));
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void whenNameDesc () {
        Comparator<UserCom> comp = new NameEndComp();
        int rsl = comp.compare(new UserCom("Ub", 1), new UserCom("Di", 0));
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenPriorityDesc () {
        Comparator<UserCom> comp = new PriorityEndComp();
        int rsl = comp.compare(new UserCom("Ub", 1), new UserCom("Di", 0));
        assertThat(rsl, lessThan(0));
    }
}
