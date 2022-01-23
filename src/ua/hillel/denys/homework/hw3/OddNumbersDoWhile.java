package ua.hillel.denys.homework.hw3;

/**
 * JavaDoc
 * <p>
 * При помощи цикла do-while вывести на экран нечетные числа от 1 до 99
 *
 * @author Tarasiuk Denys
 */

public class OddNumbersDoWhile {

    public static void main(String[] args) {

        int number = 1;
        do {
            System.out.println(number);
            number += 2;
        } while (number < 100);

//        Второй вариант
//        int number = 0;
//        do {
//           if (number % 2 != 0) {
//                System.out.println(number);
//            }
//            number++;
//        } while (number < 100);
    }
}
