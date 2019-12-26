package ru.job4j.comparator;

import java.util.Comparator;

public class NameBeginComp implements Comparator<UserCom> {
    @Override
    public int compare (UserCom first, UserCom second){
        return first.getName().compareTo(second.getName());
    }
}
