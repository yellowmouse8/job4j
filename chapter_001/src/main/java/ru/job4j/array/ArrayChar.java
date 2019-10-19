package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = false;
        for (int index = 0; index != word.length-pref.length; index++) {
            result=false;
            for (int index2 = 0; index2 != pref.length; index2++) {
                if (pref[index2] == word[index]) {
                    result = true;
                    break;
                }
            }

        }
        return result;
    }
}
