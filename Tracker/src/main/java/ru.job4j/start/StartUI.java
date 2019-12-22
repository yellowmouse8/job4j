package ru.job4j.start;

import ru.job4j.models.*;

import java.util.ArrayList;
import java.util.List;


public class StartUI {

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt(" Select: ", actions.length );
            UserAction action = actions[select];
            run = action.execute(input, tracker);

        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println(" === Menu === ");
        for (int i=0; i!=actions.length; i++) {
            System.out.println(actions[i].info());
        }
    }
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(0, " Add new Items. "),new ShowAllItems(1," Show all items. ")
                ,new ReplaceItem(2," Edit item. "), new DeleteItem(3," Delete item. ")
        ,new FindByID(4," Find item by ID. "), new FindbyName(5," Find item by name. ")
                , new ExitProgram(6," Exit program. ")};
        new StartUI().init(validate, tracker, actions);
    }
}

