package ru.job4j.start;

import org.hamcrest.core.Is;
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
    private final String menu = new StringBuilder()
            .append("0 :  Add new Items. \r\n")
            .append("1 :  Show all items. \r\n")
            .append("2 :  Edit item. \r\n")
            .append("3 :  Delete item. \r\n")
            .append("4 :  Find item by ID. \r\n")
            .append("5 :  Find item by name. \r\n")
            .append("6 :  Exit program. ")
            .toString();

    @Before
    public void loadOutput() {
        System.out.println(" execute before method ");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stout);
        System.out.println(" execute after method. ");
    }


    @Test
    public void findAllItems() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("  BossFort "));
        Item item2 = tracker.add(new Item("  Gamumu "));
        Item item3 = tracker.add(new Item("  Fix "));
        Item item4 = tracker.add(new Item("  Leburge "));
        Input input = new StubInput(new String[]{"1", "y"});
        new StartUI(input, tracker, output).init();
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add(menu)
                                .add(" Name item: " + item1.getName())
                                .add(" Name item: " + item2.getName())
                                .add(" Name item: " + item3.getName())
                                .add(" Name item: " + item4.getName())
                                .add(" List of items. ")
                                .toString()
                )
        );
    }

    @Test
    public void whenFIndbyName() {
        Tracker tracker = new Tracker();
        Item item2 = new Item("  Fix ");
        Item item3 = new Item("Leburge");
        Item item4 = new Item("Gamumu");
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        Input input = new StubInput(new String[]{"5", "Leburge", "y"});
        new StartUI(input, tracker, output).init();
        assertThat(new String(out.toByteArray()), is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add(menu)
                .add(" Name : " + item3.getName())
                .add("==== End Search. ===== ")
                .toString()

        ));
    }
}

