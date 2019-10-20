package ru.job4j.array;

import java.util.Arrays;

public class ArrayEnds {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;;
        for (int index = 0; index !=post.length; index++) {
            System.out.println(" ВОрд индекс "+ word[word.length-1-index]+ " Пост индекс " + post[post.length-1-index]);
            result = true;
            if (post[post.length-1-index]!=word[word.length-1-index]) {
                result = false;
                break;
            }
        }

        return result;
    }
}
