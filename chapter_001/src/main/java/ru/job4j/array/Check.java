package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int index = 0; index != data.length; index++) {
            result = true;
            if (data[0] != data[index]) {
                result = false;
                break;

            }
        }
        return result;
    }
}
