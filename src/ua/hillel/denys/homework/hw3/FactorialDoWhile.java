package ua.hillel.denys.homework.hw3;

/**
 * JavaDoc
 * <p>
 * Дано число n при помощи цикла do-while посчитать факториал n!
 *
 * @author Tarasiuk Denys
 */

public class FactorialDoWhile {

    public static void main(String[] args) {

        int n = 5;
        int result = 1;
        int i = 1;

        do {
            result = result * i;
            i++;
        } while (i <= n);
        System.out.println("Factorial: " + n + "! = " + result);
    }
}
