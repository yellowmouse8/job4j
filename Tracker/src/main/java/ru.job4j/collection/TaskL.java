package ru.job4j.collection;

public class TaskL {
    private String number;
    private String description;

    public TaskL(String number, String description){
        this.number = number;
        this.description = description;
    }
    public String getNumber(){
        return number;
    }
    public String getDescription(){
        return description;
    }
}
