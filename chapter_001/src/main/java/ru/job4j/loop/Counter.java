package ru.job4j.loop;

public class Counter {
    public int add(int start, int finish){
        int sum=0;
        int x=0;
        for (start=start;start<=finish;start++) {
            if (start%2==0){
             x=x+start;
            }
            sum=x;
        }
        return sum;
    }
}
