package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println(" Пусть бегут неуклюжие ");
        } else if (position == 2) {
            System.out.println(" Спокойной ночи ");
        } else {
            System.out.println(" Песня не найдена ");
        }
    }

    public static void main(String[] args) {
        Jukebox pesnya = new Jukebox();
        pesnya.music(1);
        pesnya.music(2);
        pesnya.music(0);
    }
}
