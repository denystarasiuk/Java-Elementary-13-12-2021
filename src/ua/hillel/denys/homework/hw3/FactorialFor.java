package ua.hillel.denys.homework.hw3;

/**
 * JavaDoc
 * <p>
 * Дано число n при помощи цикла for посчитать факториал n!
 *
 * @author Tarasiuk Denys
 */

public class FactorialFor {

    public static void main(String[] args) {

        int n = 5;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;

        }
        System.out.println("Factorial: " + n + "! = " + result);
    }
}
