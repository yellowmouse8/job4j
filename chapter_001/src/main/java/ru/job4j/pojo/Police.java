package ru.job4j.pojo;

import java.util.Calendar;
import java.util.Date;

public class Police {

    public static void main (String[]args){
        License license = new License();
        license.setOwner(" Djavded ");
        license.setModel(" Gaz56 ");
        license.setCode(" ВА512043МЗ ");
        license.setCreated( new Date(1955,4,23,22,43,43) );

        System.out.println( license.getOwner() + " has a car = " + license.getModel() + " :"+ license.getCreated() + " year made " + license.getCode() );
    }
}
