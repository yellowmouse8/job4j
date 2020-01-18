package ru.job4j.models;

import ru.job4j.start.Tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MenuTracker {
    private Input input;
    private Tracker tracker;

    private List<UserAction> actions = new ArrayList<>();

    private final Consumer<String> output;

    public MenuTracker(Input input, Tracker tracker, Consumer<String> output) {
        this.input = input;
        this.tracker = tracker;
        this.output = output;
    }

    public int getActionsLength() {
        return this.actions.size();
    }

    public void fillActions() {
        this.actions.addAll(Arrays.asList(new CreateAction(0, " Add new Items. "), new ShowAllItems(1, " Show all items. "),
                new ReplaceItem(2, " Edit item. "), new DeleteItem(3, " Delete item. "),
                new FindByID(4, " Find item by ID. "), new FindbyName(5, " Find item by name. "),
                new ExitProgram(6, " Exit program. ")));
    }

    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);
    }

    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }
}
