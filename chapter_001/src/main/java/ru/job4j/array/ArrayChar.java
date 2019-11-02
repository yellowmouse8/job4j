package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = false;
        for (int index = 0; index != word.length - pref.length; index++) {
            result = true;
            if (pref[index] != word[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
