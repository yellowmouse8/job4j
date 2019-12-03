package ru.job4j.start;

import ru.job4j.models.*;


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
        System.out.println(" ");
        for (int i=0; i!=actions.length; i++){
            System.out.println(i + ". "  + actions[i].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(),new ShowAllItems(),new ReplaceItem(), new DeleteItem()
        ,new FindByID(), new FindbyName(), new ExitProgram()};
        new StartUI().init(validate, tracker, actions);
    }
}

