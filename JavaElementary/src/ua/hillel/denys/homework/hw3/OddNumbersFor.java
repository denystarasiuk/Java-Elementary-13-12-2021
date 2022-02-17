package ua.hillel.denys.homework.hw3;

/**
 * JavaDoc
 *
 * При помощи цикла for вывести на экран нечетные числа от 1 до 99
 *
 * @author Tarasiuk Denys
 */

public class OddNumbersFor {

    public static void main(String[] args) {

        for (int i = 1; i < 100; i += 2) {
            System.out.println(i);
        }

//        Второй вариант
//        for (int i = 1; i < 100; i++) {
//           if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }
    }
}
