package ua.hillel.denys.homework.hw3;

/**
 * JavaDoc
 * <p>
 * Вывести 10 первых чисел последовательности 0, -5,-10,-15..
 *
 * @author Tarasiuk Denys
 */

public class TenFirstNumbers {

    public static void main(String[] args) {

        int number = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number);
            number -= 5;
        }

//        Второй вариант
//        int number = 0;
//        int i = 1;
//        while (i <= 10) {
//            System.out.println(number);
//            number -= 5;
//            i++;
//        }

    }
}
