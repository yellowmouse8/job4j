package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = this.load - this.load;

    }

    public static void main(String[] args) {
        Battery gp = new Battery(5);
        Battery duracell = new Battery(15);
        System.out.println(" 'GP' battery take off " + gp.load + " energy and add to 'Duracell' " + duracell.load + " energy ");
        gp.exchange(duracell);
        System.out.println(" Now 'GP' battery is  " + gp.load + " energy, and 'Duracell' battery  " + duracell.load + " energy ");

    }
}
