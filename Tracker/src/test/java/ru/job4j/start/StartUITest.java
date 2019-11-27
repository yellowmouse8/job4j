package ru.job4j.start;

import org.junit.Test;
import ru.job4j.models.ConsoleInput;
import ru.job4j.models.Input;
import ru.job4j.models.Item;
import ru.job4j.models.StubInput;
import ru.job4j.start.StartUI;
import ru.job4j.start.Tracker;

import java.util.Scanner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {" Fix PC ", " VBN ", " MN ", " SDA"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item(" ID123 ", " Fix PC ");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item(" ID12313 ", " Set up");
        tracker.add(item);
        String[] answers = {item.getId(), " replace item "};
        StartUI.editName(new StubInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is(" replace item "));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item one = new Item(" ID2243 ", " Mave ");
        Item two = new Item(" ID662243 ", " Hammer ");
        Item three = new Item(" ID442243 ", " Maul ");
        tracker.add(one);
        tracker.add(two);
        tracker.add(three);
        String[] answers = {two.getId()};
        StartUI.delete(new StubInput(answers), tracker);
        assertThat(tracker.findAll()[1].getName(), is(" Maul "));
    }

}

