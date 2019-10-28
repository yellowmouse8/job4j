/**
 * Пакет для вычисления
 */
package ru.job4j.calculate;

/**
 * Class Класс для вычисления арифметических операций
 *
 * @author Pavel Shah
 * @version 3.0
 * @since 2.10
 */
public class Calculator {
    /**
     * Method add вычилсит upiter plus mars , выведет на консоль готовое выражение.
     *
     * @param upiter parametr1
     * @param mars   parametr2
     */
    public static void add(double upiter, double mars) {
        double result = upiter + mars;
        System.out.println(upiter + "+" + mars + "=" + result);
    }

    /**
     * Method - div вычислит upiter divided mars, выведет на консоль готовое выражение.
     *
     * @param upiter parametr1
     * @param mars   parametr2
     */
    public static void div(double upiter, double mars) {
        double result = upiter / mars;
        System.out.println(upiter + "/" + mars + "=" + result);
    }

    /**
     * Method - multiply вычислит upiter times mars, выведет на консоль готовое выражение.
     *
     * @param upiter parametr1
     * @param mars   parametr2
     */
    public static void multiply(double upiter, double mars) {
        double result = upiter * mars;
        System.out.println(upiter + "*" + mars + "=" + result);
    }

    /**
     * Method subtrack вычислит upiter minus mars, выведет на консоль готовое выражение.
     *
     * @param upiter parametr1
     * @param mars   parametr2
     */
    public static void subtrack(double upiter, double mars) {
        double result = upiter - mars;
        System.out.println(upiter + "-" + mars + "=" + result);
    }

    /**
     * Main, вывод строк со всеми готовыми арифметическими выражениями
     *
     * @param args - args.
     */
    public static void main(String[] args) {
        add(1, 1);
        add(2, 2);
        div(4, 2);
        multiply(2, 1);
        subtrack(10, 5);
    }
}
