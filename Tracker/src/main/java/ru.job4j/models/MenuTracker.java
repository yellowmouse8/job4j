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
        this.actions.add(new CreateAction2(0, " Add new Items. "));
        this.actions.add(new ShowAllItems2(1, " Show all items. "));
        this.actions.add(new ReplaceItem2(2, " Edit item. "));
        this.actions.add(new DeleteItem2(3, " Delete item. "));
        this.actions.add(new FindByID2(4, " Find item by ID. "));
        this.actions.add(new FindbyName2(5, " Find item by name. "));
        this.actions.add(new ExitProgram2(6, " Exit program. "));
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

    public class CreateAction2 extends BaseAction {
        public CreateAction2(int key, String name) {
            super(key, name);
        }

        @Override
        public boolean execute(Input input, Tracker tracker) {
            String name = input.askStr(" Enter name: ");
            String id = input.askStr(" Enter ID: ");
            Item item = new Item(id, name);
            tracker.add(item);
            output.accept(" New item with name:" + item.getName() + " added.  ");
            return true;
        }
    }

    public class ShowAllItems2 extends BaseAction {
        public ShowAllItems2(int key, String name) {
            super(key, name);
        }

        public boolean execute(Input input, Tracker tracker) {
            List<Item> items = tracker.findAll();
            for (Item item : items) {
                output.accept(" Name item: " + item.getName());
            }
            output.accept(" List of items. ");
            return true;
        }
    }

    public class ReplaceItem2 extends BaseAction {
        public ReplaceItem2(int key, String name) {
            super(key, name);
        }

        public boolean execute(Input input, Tracker tracker) {
            String name = input.askStr(" Enter name: ");
            String id = input.askStr(" Enter id: ");
            Item item = new Item(id, name);
            item.setId(id);
            if (tracker.replace(id, item)) {
                output.accept(" Item name: " + name + "editing to :"
                        + tracker.replace(id, item));

            } else {
                output.accept(" ID item : " + id + " not founded. ");
            }
            return true;
        }
    }

    public class DeleteItem2 extends BaseAction {

        public DeleteItem2(int key, String name) {
            super(key, name);
        }

        public boolean execute(Input input, Tracker tracker) {
            String id = input.askStr("  Enter the task Id for deleting:   ");
            tracker.delete(id);
            output.accept(" Delete item by id: " + id + " completed. ");
            return true;
        }
    }

    public class FindByID2 extends BaseAction {

        public FindByID2(int key, String name) {
            super(key, name);
        }

        public boolean execute(Input input, Tracker tracker) {
            String id = input.askStr(" Enter the ID what you want to find: ");
            Item found = tracker.findById(id);
            output.accept(" Your Id is:  " + found.getId()
                    + " Name: " + found.getName() + ". ");
            return true;
        }
    }

    public class FindbyName2 extends BaseAction {
        public FindbyName2(int key, String name) {
            super(key, name);
        }

        public boolean execute(Input input, Tracker tracker) {
            String name = input.askStr(" Enter your Name item: ");
            List<Item> items = tracker.findByName(name);

            if (items.size() != 0) {
                for (Item item : items) {
                    output.accept(" Name : " + item.getName());
                }
            } else {
                output.accept(" No Item with that Name. ");
            }

            output.accept("==== End Search. ===== ");
            return true;
        }
    }

    public class ExitProgram2 extends BaseAction {
        public ExitProgram2(int key, String name) {
            super(key, name);
        }

        public boolean execute(Input input, Tracker tracker) {
            output.accept(" NO tasks anymore. ");
            output.accept(" Exit. ");
            return false;
        }
    }
}
