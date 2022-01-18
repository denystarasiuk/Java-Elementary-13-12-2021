package ua.hillel.denys.homework.hw1;

/**
 * JavaDoc
 * <p>
 * Программа, которая находит среднее арифметическое значение произвольного количества чисел
 *
 * @author Tarasiuk Denys
 */

public class AverageNumbers {

    public static void main(String[] args) {
        double sum = 0;
        System.out.println("введите числа");

        for (String str : args) {
            System.out.println(str);
            double i = Double.valueOf(str);
            sum += i;
        }
        System.out.println("среднее арифметическое чисел: " + sum / args.length);

    }
}
