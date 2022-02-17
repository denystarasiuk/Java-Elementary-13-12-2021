package ua.hillel.denys.homework.hw3;

/**
 * JavaDoc
 * <p>
 * При помощи цикла while вывести на экран нечетные числа от 1 до 99
 *
 * @author Tarasiuk Denys
 */

public class OddNumbersWhile {

    public static void main(String[] args) {

        int number = 1;
        while (number <100) {
            System.out.println(number);
            number +=2;
        }

//        Второй вариант
//        int number = 0;
//        while (number < 100) {
//            if (number % 2 != 0) {
//                System.out.println(number);
//            }
//            number++;
//        }
    }
}
