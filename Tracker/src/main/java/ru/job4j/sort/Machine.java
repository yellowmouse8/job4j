package ru.job4j.sort;

import ru.job4j.models.ConsoleInput;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5 , 2, 1};

    public int [] change (int money, int price){
        int[] rsl = new int[100];
        int size = 0;
        int moneyChange = money - price;
        for ( int index = 0; index != this.COINS.length; index++) {
            while (moneyChange - this.COINS[index] >= 0) {
                moneyChange = moneyChange - this.COINS[index];
                rsl[size++] = this.COINS[index];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
    public static  void main (String[]args){
        Machine machine = new Machine();
        machine.change(100, 23);
    }
}
