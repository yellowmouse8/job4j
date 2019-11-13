package ru.job4j.pojo;

import java.util.Date;


public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName(" Pavel Shakh ");
        student.setGroup(" Junior ");
        student.setInvited(new Date(2019, 4, 23));

        System.out.println(" Student = " + student.getName() + " . " + " Group = " + student.getGroup() + " . " + " Date invited  = " + student.getInvited());
    }
}
