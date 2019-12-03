package ru.job4j.models;

public interface Input {
    String askStr(String question);

    int askInt(String question);
    int askInt(String question, int max);
}


