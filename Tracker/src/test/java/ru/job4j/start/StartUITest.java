package ru.job4j.start;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import ru.job4j.models.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;
import java.util.function.Consumer;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    final PrintStream stout = new PrintStream(out);
    private final Consumer<String> output = new Consumer<String>() {
        @Override
        public void accept(String s) {
            stout.println(s);
        }
    };

    @Before
    public void loadOutput() {
        System.out.println(" execute before method ");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.out.println(" execute after method. ");
    }


    @Test
    public void findAllItems() {

        Tracker tracker = new Tracker();
        Item item = new Item(" ID341254 ", "  BossFort ");
        Item item2 = new Item(" ID9235554 ", "  Gamumu ");
        Item item3 = new Item(" ID4333 ", "  Fix ");
        Item item4 = new Item(" ID4343 ", "  Leburge ");
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        ShowAllItems showAllItems = new ShowAllItems(1, " Show all items. ");
        showAllItems.execute(new StubInput(new String[]{}), tracker);
        String expected = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add(" List of all items: ")
                .add(" Id item: " + item.getId() + " Name item: " + item.getName())
                .add(" Id item: " + item2.getId() + " Name item: " + item2.getName())
                .add(" Id item: " + item3.getId() + " Name item: " + item3.getName())
                .add(" Id item: " + item4.getId() + " Name item: " + item4.getName())
                .add(" List of items. ")
                .toString();
        assertThat(this.out.toString(), is(expected));

    }

    @Test
    public void whenFIndbyName() {
        Tracker tracker = new Tracker();
        Item item3 = new Item("  Fix ");
        Item item4 = new Item(" Leburge ");
        tracker.add(item3);
        tracker.add(item4);
        new FindbyName(6, " Find item by Name ").execute(new StubInput(new String[]{item4.getName()}), tracker);
        String expected = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add(" Name : " + item4.getName())
                .add("==== End Search. ===== ")
                .toString();
        assertThat(this.out.toString(), is(expected));

    }

}

