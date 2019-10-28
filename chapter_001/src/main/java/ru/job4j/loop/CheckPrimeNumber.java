package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int num) {
        boolean prime = true;
        for (int nol = 2; nol <= Math.sqrt(num); nol++) {
            if (num % nol == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}

