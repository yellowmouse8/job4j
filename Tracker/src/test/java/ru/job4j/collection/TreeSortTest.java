package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.collectiontreeset.TreeSort;
import ru.job4j.collectiontreeset.UserL;


import java.util.*;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class TreeSortTest {
    @Test
    public void whenSameNames() {
        List<UserL> list = new ArrayList<>();
        list.addAll(Arrays.asList(new UserL("PI", 28),
                new UserL("Vi", 23),
                new UserL("Bi", 24),
                new UserL("Me", 19),
                new UserL("Bi", 15)));
        TreeSort treeSort = new TreeSort();
        treeSort.sorting(list);
        assertThat(list.get(0).getAge(), is(15));
    }

    @Test
    public void whenAsc() {
        Set<UserL> userLS = new TreeSet<>();
        userLS.addAll(Arrays.asList(new UserL("PI", 30), new UserL("Vi", 26)));
        Iterator<UserL> it = userLS.iterator();
        assertThat(it.next(), is(new UserL("Vi", 26)));
        assertThat(it.next(), is(new UserL("PI", 30)));
    }

    @Test
    public void whenComparePiVsVi() {
        int rsl = new UserL("PI", 30).compareTo(new UserL("Vi", 26));
        assertThat(rsl, greaterThan(0));
    }

}
