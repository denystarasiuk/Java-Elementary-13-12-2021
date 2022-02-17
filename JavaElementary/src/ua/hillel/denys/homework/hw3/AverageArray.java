package ua.hillel.denys.homework.hw3;

import java.util.Arrays;
import java.util.Random;

/**
 * JavaDoc
 *
 * Найти среднее арифметическое всех элементов массива.
 *
 * @author Tarasiuk Denys
 */

public class AverageArray {

    public static void main(String[] args) {

        int size = 5;
        int[] ar = new int[size];
        Random random = new Random();

        for (int i = 0; i < ar.length; i++) {
            ar[i] = random.nextInt(20) - 5;
        }
        System.out.print("Массив целых чисел имеет вид: ");
        System.out.println(Arrays.toString(ar));

        double sum = 0;
        for (int i : ar) {
            sum += i;
        }
        System.out.println("Среднее арифметическое массива: " + sum / ar.length);




    }
}
