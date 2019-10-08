package ru.job4j.loop;

public class PrimeNumber {

    public static int isPrimeUp(int finish) {
        int count = 0;
        boolean bee = true;
        for (int x = 2; x <= finish; x++) {
            bee = true;
            for (int y = 2; y <= Math.sqrt(x); y++) {
                if (x % y == 0) {
                    bee = false;
                    break;
                }
            }
            if (bee == true) {
                count++;
            }
        }
        return count;
    }
}
