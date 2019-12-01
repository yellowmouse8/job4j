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
    private final PrintStream stout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
@Before
    public void loadOutput (){
    System.out.println(" execute before method ");
        System.setOut(new PrintStream(this.out));
    }
    @After
    public void backOutput(){
        System.setOut(this.stout);
        System.out.println(" execute after method. ");
    }

    @Test
    public void whenPrtMenu (){

        StubInput input = new StubInput(new String[]{"0","1","2","3","4","5","6","7"});
        StubAction action = new StubAction();
        CreateAction createAction = new CreateAction();
        ShowAllItems showAllItems = new ShowAllItems();
        ReplaceItem replaceItem = new ReplaceItem();
        DeleteItem deleteItem = new DeleteItem();
        FindbyName findbyName = new FindbyName();
        FindByID findByID = new FindByID();
        ExitProgram exitProgram = new ExitProgram();
        new StartUI().init(input, new Tracker(),  new UserAction[]{action, createAction, showAllItems
                , replaceItem, deleteItem, findbyName, findByID, exitProgram});
        String expect = new StringJoiner(System.lineSeparator(), " ", System.lineSeparator())
                .add("0.  ==== Menu ==== ")
                .add("1.  === Add new Item. ==== ")
                .add("2.  Show all items. ")
                .add("3.  Edit Items ")
                .add("4.  Delete item.  ")
                .add("5.  Find item by Name.")
                .add("6.  Find item by ID . ")
                .add("7. Exit program." )
                .toString();
        assertThat(this.out.toString(), is(expect));

    }
    @Test
    public void findAllItems (){

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
        assertThat(this.out.toString(),is (expected));

    }
    @Test
    public void whenFIndbyName (){
        Tracker tracker = new Tracker();
        Item item3 = new Item("  Fix ");
        Item item4 = new Item( " Leburge ");
        tracker.add(item3);
        tracker.add(item4);
        new FindbyName().execute( new StubInput(new String[]{  item4.getName() }) , tracker);
        String expected = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add(" Name : " + item4.getName()  )
                .add("==== End Search. ===== ")
                .toString();
        assertThat(this.out.toString(), is (expected));

    }

}

