package ua.hillel.denys.homework.hw3;

/**
 * JavaDoc
 * <p>
 * Даны переменные x и n вычислить x^n
 *
 * @author Tarasiuk Denys
 */

public class Exponent {

    public static void main(String[] args) {

        int x = 2;
        int n = 4;
        int result = 1;
        int i = 1;
        while (i <= n) {
            result = x * result;
            i++;
        }
        System.out.println(x + "^" + n + " = " + result);

//        Второй вариант
//        for (int i = 1; i<=n; i++){
//            result = x * result;
//        }
//        System.out.println(x + "^" + n + " = " + result);
    }
}
