package ru.job4j.oop;

public class Cat {
    private String food;
    private String  name;

    public void show(){
        System.out.println(" Here's " + this.name + " , and he is eating  "+ this.food);
    }
    public void eat (String meat){
        this.food=meat;
    }
    public void giveNick (String nick){
        this.name=nick;
    }

    public static void main (String[]args){
        Cat cat = new Cat();
        cat.giveNick(" Gav ");
        cat.eat(" Hamon ");
        cat.show();
        cat.giveNick(" Black ");
        cat.eat(" Cheese ");
        cat.show();
    }
}
