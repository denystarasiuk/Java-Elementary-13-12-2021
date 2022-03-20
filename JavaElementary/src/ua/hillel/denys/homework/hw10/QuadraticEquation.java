package ua.hillel.denys.homework.hw10;

/**
 * Написать программу для вычисления корней квадратного уравнения
 */

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a: ");
        int a = scanner.nextInt();

        System.out.println("Введите b: ");
        int b = scanner.nextInt();

        System.out.println("Введите c: ");
        int c = scanner.nextInt();

        int discriminant = discriminant(a, b, c);
        if (positive(discriminant)) {
            double x1 = (-b + (Math.sqrt(discriminant))) / (2 * a);
            double x2 = (-b - (Math.sqrt(discriminant))) / (2 * a);
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        } else if (zero(discriminant)) {
            double x = -b / (2 * (double) a);
            System.out.println("x1: " + x);
        } else {
            System.out.println("Дискриминант меньше нуля");
        }
    }

    public static int discriminant(int a, int b, int c) {
        return (b * b) - (4 * a * c);
    }

    public static boolean positive(int value) {
        return value > 0;
    }

    public static boolean zero(int value) {
        return value == 0;
    }
}
