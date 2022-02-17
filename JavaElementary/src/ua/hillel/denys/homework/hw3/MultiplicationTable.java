package ua.hillel.denys.homework.hw3;

import java.util.Scanner;

/**
 * JavaDoc
 * <p>
 * Необходимо вывести на экран таблицу умножения на Х: (любое число вводимое из консоли)
 *
 * @author Tarasiuk Denys
 */

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        double x = in.nextDouble();

        System.out.println("Таблица умножения на 10 числа " + x);
        for (int i =1; i<=10; i++) {
            System.out.println(x + " * " + i + " = " + (x*i));
        }

//        Второй вариант
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите число");
//        double x = in.nextDouble();
//
//        System.out.println("Таблица умножения на 10 числа " + x);
//        int i = 1;
//        while (i <= 10) {
//            System.out.println(x + " * " + i + " = " + (x * i));
//            i++;
//        }

    }
}
