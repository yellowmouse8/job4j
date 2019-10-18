package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int index = 0; index != data.length; index++) {
            result = false;
            if (data[0] == data[index]) {
                result = true;
            }
        }
        return result;
    }
}
