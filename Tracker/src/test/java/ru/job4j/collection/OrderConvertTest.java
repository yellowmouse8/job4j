package ru.job4j.collection;

import org.junit.Test;

import javax.swing.plaf.multi.MultiSeparatorUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class OrderConvertTest {
    @Test
    public void whenSingleOrder() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Quest"));
        users.add(new User(2, "Sa"));
        HashMap<Integer, User> map = OrderConvert.process(users);
        assertThat(map.get(1), is(new User(1, "Quest")));
    }
}
