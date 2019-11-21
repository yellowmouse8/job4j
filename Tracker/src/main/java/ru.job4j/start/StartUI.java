package ru.job4j.start;

import ru.job4j.models.*;

import java.util.Scanner;

public class StartUI {


    public void init(Scanner scanner, Tracker tracker) {
        boolean run = false;
        while (!run) {
            this.showMenu();
            System.out.println(" Select: ");
            int select = Integer.valueOf(scanner.nextLine());

            if (select == 0) {
                System.out.println(" === Create a new Item ==== ");
                System.out.println(" Enter name ");
                String name = scanner.nextLine();
                Item item = new Item(name, name);
                tracker.add(item);
                System.out.println(" New Item with getId:  " + item.getId() + " ===== ");
            } else if (select == 1) {
                System.out.println(" Show all items ");
                for (Item items : tracker.findAll()) {
                    System.out.println(" Name:  " + items.getName() + " Id: " +
                            items.getId());
                }
                System.out.println(" ===== End List ==== ");

            } else if (select == 2) {
                System.out.println(" ==== Edit item === ");
                String name = scanner.nextLine();
                Item item = new Item(name, name);
                tracker.replace(name, new Item(name, name));
                System.out.println(" ==== Edit item: " + name + " is complete === ");
            } else if (select == 3) {
                System.out.println(" Enter the task Id  ");
                String name = scanner.nextLine();
                tracker.delete(name);
                System.out.println(" Delete item by id: " + name + " completed. ");
            } else if (select == 4) {
                System.out.println(" Enter the ID what you want to find: ");
                String name = scanner.nextLine();
                tracker.findById(name);
                System.out.println(" Your founded ID is : " + name);
            } else if (select == 5) {
                System.out.println(" Find items by name:  ");
                String name = scanner.nextLine();
                tracker.findByName(name);
                System.out.println(" Founded name is : " + name);
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
