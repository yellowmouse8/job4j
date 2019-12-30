package ru.job4j.start;

import org.junit.Test;
import ru.job4j.models.Item;
import ru.job4j.start.Tracker;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddnewUtemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item(" test1 ", " saghgjgjj");
        Item expected = tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result, is(expected));
    }

    @Test
    public void replaceItem() {
        Tracker tracker = new Tracker();
        Item previous = new Item("First", " sgaghgj");
        tracker.add(previous);
        Item next = new Item("Second", " fhfsaghgj");
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        String result = tracker.findById(previous.getId()).getName();
        String expected = " fhfsaghgj";
        assertThat(result, is(expected));
    }

    @Test
    public void deleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item(" Disc ", " fghdfh");
        Item item2 = new Item(" Set ", " saghgj");
        Item item3 = new Item(" Try ", " saghgasfj");
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item3);
        tracker.delete(item2.getId());

        List<Item> expected = Arrays.asList(item, item3);
        List<Item> result = tracker.findAll();
        assertThat(result, is(expected));
    }

    @Test
    public void findAll() {
        Tracker tracker = new Tracker();
        Item item = new Item(" Void ", " ahgh");
        Item item2 = new Item(" Type ", " 4334");
        Item item3 = new Item(" Const ", " asfdg");
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item3);
        List<Item> expected = Arrays.asList(item, item2, item3);
        List<Item> result = tracker.findAll();
        assertThat(result, is(expected));
    }

    @Test
    public void findByName() {
        Tracker tracker = new Tracker();
        Item item = new Item(" bill ", " asfa");
        Item item2 = new Item(" of ", " 214sa");
        Item item3 = new Item(" lading ", " asfasf");
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item3);
        assertThat(tracker.findByName(item2.getName()).get(0), is(item2));
    }

    @Test
    public void findByID() {
        Tracker tracker = new Tracker();
        Item item = new Item(" Bear ", " asfaf");
        Item item2 = new Item(" 123124 ", " Todd ");
        Item item3 = new Item(" Frog ", " asf34");
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item3);
        String expected = " Todd ";
        String result = tracker.findById(item2.getId()).getName();
        assertThat(result, is(expected));
    }
}
