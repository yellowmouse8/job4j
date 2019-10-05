package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int num) {
        boolean prime=false;
        for (int nol=0;nol<=num;nol++){
            if ((num%5)==0){
                prime=true;
            }
        }
        return prime;
        }
    }

