package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[]array){

        for (int index=0; index<array.length; index++){
            String cell=array[index];
            if (array[index]==null) {
                int index2=index+1;
                while (index2<array.length){
                    String tmp= array[index2];
                    array[index2]=array[index2-1];
                    // Можно сделать и проще перестановку типа : array[index2-1]=array[index];
                    // То есть обойтись только одной приравнивающей переменной без ' tmp';
                    array[index2-1]=tmp;
                    index2++;
                } array[array.length-1]=null;
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }
    public static void main (String[]args){
        String[] imput= { null," I ","wanna", " be ", null, " compressed ", null ,};
        String [] compressed = compress(imput);
        System.out.println();
        for ( int index=0; index<compressed.length; index++){
            System.out.print(compressed[index] + " ");
        }
    }
}
