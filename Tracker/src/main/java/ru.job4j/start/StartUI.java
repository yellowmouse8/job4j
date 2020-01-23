package ru.job4j.start;

import com.sun.jdi.IncompatibleThreadStateException;
import ru.job4j.models.*;

import javax.print.attribute.IntegerSyntax;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;


public class StartUI {
    private final Input input;
    private final Tracker tracker;
    private final Consumer<String> output;

    public StartUI(Input input, Tracker tracker, Consumer<String> output) {
        this.input = input;
        this.tracker = tracker;
        this.output = output;
    }

    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker, output);
        List<Integer> list = new ArrayList<>();
        menu.fillActions();
        for (int i = 0; i != menu.getActionsLength(); i++) {
            list.add(i);
        }
        do {
            menu.show();
            menu.select(input.askInt("Выберете действие: ", list.toArray().length));
        } while (!"y".equals(this.input.askStr("Выход?(y/n): ")));
    }


    public static void main(String[] args) {
        new StartUI(new ValidateInput(new ConsoleInput()), new Tracker(), System.out::println).init();
    }
}

