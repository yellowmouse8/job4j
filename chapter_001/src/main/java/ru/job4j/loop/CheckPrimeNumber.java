package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int num) {
        boolean prime = false;
        for (int nol = 2; nol <= num; nol++) {
            if ((num % nol) == 0) {
                prime = true;
            }
        }
        return prime;
    }
}

