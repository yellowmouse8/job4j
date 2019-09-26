package ru.job4j.condition;

public class Truckjob {
        public static void main (String[]args){
            ru.job4j.condition.Driver Vitec = new ru.job4j.condition.Driver();
            System.out.println(" ВИтек хочет на работу водителем.");
            if (!Vitec.Vibor()){
                System.out.println(" Надо срочно получить права. ");
                Vitec.SdalPrava('A');
            }
            if (Vitec.Prava('C')){
                System.out.println(" ВИтек сегодня работает на Траке");
            }
            else if(Vitec.Prava('B')){
                System.out.println(" Сегодня только такси ");
            }
            else {
                System.out.println(" Для мотоциклистов только почта банк. ");
            }
        }
}
