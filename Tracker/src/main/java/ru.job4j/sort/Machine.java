package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int moneyChange = money - price;
        for (int index = 0; index != this.coins.length; index++) {
            while (moneyChange - this.coins[index] >= 0) {
                moneyChange = moneyChange - this.coins[index];
                rsl[size++] = this.coins[index];
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.change(100, 23);
    }
}
