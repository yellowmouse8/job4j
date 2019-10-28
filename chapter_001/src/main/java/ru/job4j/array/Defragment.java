package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {

        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            if (array[index] == null) {
                int index2 = index + 1;
                while (index2 < array.length) {
                    if (array[index2] != null) {
                        array[index] = array[index2];
                        array[index2] = null;
                        break;
                    }
                    index2++;
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] imput = {null, " I ", "wanna", null, null, null, " be ", null, " compressed ", null,};
        String[] compressed = compress(imput);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
