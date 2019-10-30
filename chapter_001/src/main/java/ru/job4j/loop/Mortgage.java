package ru.job4j.loop;

public class Mortgage {
    public int year(int credit, int zarplata, double procent) {
        int year = 0;
        double procent1 = procent / 100;
        double paymentYear = credit * procent1 + credit;
        while (zarplata <= paymentYear) {
            paymentYear = ((paymentYear - zarplata) * procent1) + (paymentYear - zarplata);
            year++;
        }
        return year;
    }
}
