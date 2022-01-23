package ua.hillel.denys.homework.hw3;

/**
 * JavaDoc
 * <p>
 * Дано число n при помощи цикла while посчитать факториал n!
 *
 * @author Tarasiuk Denys
 */

public class FactorialWhile {

    public static void main(String[] args) {

        int n = 5;
        int result = 1;
        int i = 1;
        while (i <= n) {
            result = result * i;
            i++;
        }
        System.out.println("Factorial: " + n + "! = " + result);
    }
}
