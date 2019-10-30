package ru.job4j.condition;

public class Truckjob {
    public static void main(String[] args) {
        ru.job4j.condition.Driver vitec = new ru.job4j.condition.Driver();
        System.out.println(" ВИтек хочет на работу водителем.");
        if (!vitec.vibor()) {
            System.out.println(" Надо срочно получить права. ");
            vitec.sdalPrava('A');
        }
        if (vitec.prava('C')) {
            System.out.println(" ВИтек сегодня работает на Траке");
        } else if (vitec.prava('B')) {
            System.out.println(" Сегодня только такси ");
        } else {
            System.out.println(" Для мотоциклистов только почта банк. ");
        }
    }
}
