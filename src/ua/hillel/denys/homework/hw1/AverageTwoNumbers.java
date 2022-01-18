package ua.hillel.denys.homework.hw1;

/**
 * JavaDoc
 *
 * Программа, которая находит среднее арифметическое значение двух чисел
 *
 * @author Tarasiuk Denys
 */

public class AverageTwoNumbers {

    public static void main(String[] args) {

        double sum = 0;
        System.out.println("введите два числа");

        if (args.length == 2) {
            for (String str : args) {
                System.out.println(str);
                double i = Double.valueOf(str);
                sum += i;
            }
            System.out.println("среднее арифметическое двух чисел: " + sum / args.length);
        } else if (args.length > 2) {
            System.out.println("введенно больше двух чисел");
        } else {
            System.out.println("введенно меньше двух чисел");
        }
    }
}
