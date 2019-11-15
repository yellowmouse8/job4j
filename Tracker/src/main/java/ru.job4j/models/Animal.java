package ru.job4j.models;

public class Animal {
    public String name;

    public Animal() {
        super();
        System.out.println(" load VS ");
    }

    public Animal(String name) {
        super();
        this.name = name;
        System.out.println(" load Animal ");
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger(" name ");
    }
}
