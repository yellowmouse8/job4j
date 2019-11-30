package ru.job4j.start;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import ru.job4j.models.*;
import ru.job4j.start.StartUI;
import ru.job4j.start.Tracker;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenPrtMenu (){
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));

        StubInput input = new StubInput(new String[]{"0","1","2","3","4","5","6"});
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[]{action});
        String expect = new StringJoiner(System.lineSeparator(), " ", System.lineSeparator())
                .add("Menu. ")
                .add("0.  Stub Action. ")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }
    @Test
    public void findAllItems (){
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        Tracker tracker = new Tracker();
        Item item = new Item(" ID341254 ", "  BossFort ");
        Item item2 = new Item(" ID9235554 ", "  Gamumu ");
        Item item3 = new Item(" ID4333 ", "  Fix ");
        Item item4 = new Item(" ID4343 ", "  Leburge ");
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        ShowAllItems showAllItems = new ShowAllItems();
        showAllItems.execute(new StubInput(new String[]{}), tracker);
        String expected = new StringJoiner(System.lineSeparator(), "" , System.lineSeparator())
                .add(" List of all items: ")
                .add(" Id item: " + item.getId() + " Name item: " + item.getName())
                .add(" Id item: " + item2.getId() + " Name item: " + item2.getName())
                .add(" Id item: " + item3.getId() + " Name item: " + item3.getName())
                .add(" Id item: " + item4.getId() + " Name item: " + item4.getName())
                .add(" List of items. ")
                .toString();
        assertThat(new String(out.toByteArray()),is (expected));
        System.setOut(def);
    }
    @Test
    public void whenFIndbyName (){
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stout = System.out;
        System.setOut(new PrintStream(out));
        StubInput input = new StubInput(new String[]{" Hoss "});
        Tracker tracker = new Tracker();
        new FindbyName().execute(input, tracker);
        String expected = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add(" Hoss ")
                .toString();
        assertThat(new String(out.toByteArray()), is (expected));
    }

}

