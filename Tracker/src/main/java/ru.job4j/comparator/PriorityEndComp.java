package ru.job4j.comparator;

import java.util.Comparator;

public class PriorityEndComp implements Comparator<UserCom> {
    @Override
    public int compare (UserCom first , UserCom second){
        return Integer.compare(second.getPriority(), first.getPriority());
    }
}
