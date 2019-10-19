package ru.job4j.array;

public class ArrayEnds {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        int start= word.length-post.length;
        for (int index = start; index != word.length; index++) {

            result = false;
            for (int index2 = 0; index2 != post.length; index2++) {

                if (post[index2] == word[index]) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
