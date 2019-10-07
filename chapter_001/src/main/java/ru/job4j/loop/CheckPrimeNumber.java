package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int num) {
        boolean prime = false;
        int dividers = 0;
        for (int nol = 1; nol <= num; nol++) {
            if (num % nol == 0) {
                dividers++;
            }
            if (dividers>2){
                prime=false;
            }else {
                prime=true;
            }
        }
        return prime;
    }
}

