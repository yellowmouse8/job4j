package ru.job4j.collection;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.departments.Departments;

import java.lang.reflect.Array;
import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class DepartmentTest {
    @Test
    public void whenAscSortThenSuccess() {
        Departments dep = new Departments();
        dep.setDeps(new TreeSet<>(Arrays.asList("K1/SK1",
                "K1/SK2",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K2",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2")));
        dep.sortAsc();
        List<String> result = new ArrayList<>(dep.getDeps());
        List<String> expected = Arrays.asList("K1", "K1/SK1", "K1/SK1/SSK1", "K1/SK1/SSK2", "K1/SK2",
                "K2", "K2/SK1", "K2/SK1/SSK1", "K2/SK1/SSK2");
        assertThat(result, is(expected));
    }

    @Test
    public void whenSortDesc() {
        Departments departments = new Departments();
        departments.setDeps(new TreeSet<>(List.of("K1/SK1",
                "K1/SK2",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K2",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2")));
        departments.sortDesc();
        List<String> result = new ArrayList<>(departments.getDeps());
        List<String> expected = Arrays.asList("K2", "K2/SK1", "K2/SK1/SSK1", "K2/SK1/SSK2", "K1", "K1/SK1",
                "K1/SK1/SSK1", "K1/SK1/SSK2", "K1/SK2");
        assertThat(result, is(expected));
    }

    @Test
    public void whenDepartmentIsReady() {
        Departments dep = new Departments();
        dep.setDeps(new TreeSet<>(Arrays.asList("K1/SK1/SSK2")));
        dep.sortAsc();
        assertThat(new ArrayList<>(dep.getDeps()), is(Arrays.asList("K1", "K1/SK1", "K1/SK1/SSK2")));
    }
}
