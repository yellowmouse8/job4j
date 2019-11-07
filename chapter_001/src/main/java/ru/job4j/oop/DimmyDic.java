package ru.job4j.oop;

public class DimmyDic {
    public String engToRus(String eng) {
        eng = " Неизвестное слово - " + eng;
        return eng;
    }

    public static void main(String[] args) {
        DimmyDic translate = new DimmyDic();
        String word = translate.engToRus(" Unknown word ");
        System.out.println(word);
    }
}
