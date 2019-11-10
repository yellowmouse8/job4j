package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }
    public static int max (int left, int right , int up){
        int result = max(left,right)>up? max(left,right): up;
        return result;
    }

    public static int max (int left, int right, int up, int down){
        int result = max(left,max(right,up))>down? max(left,max(right,up)):down;
        return result;
    }
}
