package ru.job4j.start;

import ru.job4j.models.*;
import ru.job4j.oop.Transport;


public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println(" === Create a new Item ==== ");
        String name = input.askStr("  Enter name : ");
        Item item = new Item(name, name);
        tracker.add(item);
        System.out.println(" New Item with getId:  " + item.getId() + " ===== ");
    }

    public static void showAllitems(Input input, Tracker tracker) {
        System.out.println(" show all items ");
        for (Item items : tracker.findAll()) {
            System.out.println(" Name: " + items.getName() + " Id: " + items.getId());
        }
        System.out.println(" End list. ");
    }

    public static void editName(Input input, Tracker tracker) {
        String id  = input.askStr(" Enter name for edit item: ");
        String name = input.askStr(" Enter id for edit item: ");
        Item item = new Item(id, name);
        item.setId(id);
        tracker.replace(id, item);
        System.out.println(" Item name: " + name + " editing to " + tracker.replace(name, new Item(name, name)));
        System.out.println(" ID name:  " + name + " is invalid. ");
    }

    public static void delete(Input input, Tracker tracker) {
        String name = input.askStr(" Enter the task Id for deleting:  ");
        tracker.delete(name);
        if (tracker.findById(name) != null) {
            System.out.println(" Delete item by id: " + name + " completed. ");
        } else {
            System.out.println(" No task with that id. ");
        }
    }

    public static void findbyID(Input input, Tracker tracker) {
        String name = input.askStr(" Enter the ID what you want to find: ");
        tracker.findById(name);
        if (tracker.findById(name) != null) {
            System.out.println(" Your Id founded: " + tracker.findById(name));
        } else {
            System.out.println(" No ID with that name. ");
        }
    }

    public static void findItembyName(Input input, Tracker tracker) {
        String name = input.askStr(" Find items by name: ");
        Item[] items = tracker.findByName(name);
        if (items != null) {
            for (Item item : items) {
                System.out.println(" Id " + item.getId() + " Name: "
                        + item.getName());
            }
        } else {
            System.out.println(" No item with that name: " + name + ".");
        }
        System.out.println(" End search. ");
    }

    public void init(Input input, Tracker tracker) {
        boolean run = false;
        while (!run) {
            this.showMenu();
            int select = input.askInt(" Select: ");

            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showAllitems(input, tracker);

            } else if (select == 2) {
                StartUI.editName(input, tracker);
            } else if (select == 3) {
                StartUI.delete(input, tracker);

            } else if (select == 4) {
                StartUI.findbyID(input, tracker);

            } else if (select == 5) {
                StartUI.findItembyName(input, tracker);

            } else if (select == 6) {
                System.out.println(" Exit program ");
                run = true;

            } else {
                System.out.println(" No tasks here! ");
                System.out.println(" ==== End of search ==== ");
            }

        }
    }

    private void showMenu() {
        System.out.println(" Menu. ");
        System.out.println(" 0. Add new item. ");
        System.out.println(" 1. Show all item. ");
        System.out.println(" 2. Edit item. ");
        System.out.println(" 3. Delete item.  ");
        System.out.println(" 4. Find item by id. ");
        System.out.println(" 5. Find item by name. ");
        System.out.println(" 6.  Exit program ");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}

