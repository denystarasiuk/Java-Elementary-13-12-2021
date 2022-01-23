package ua.hillel.denys.homework.hw3;

import java.util.Arrays;
import java.util.Random;

/**
 * JavaDoc
 *
 * Дан массив размерности N, найти наибольший элемент массива и
 * вывести на консоль (если наибольших элементов несколько — вывести их все).
 *
 * @author Tarasiuk Denys
 */

public class LargestElementOfTheArray {

    public static void main(String[] args) {

        int size = 10;
        int[] ar = new int[size];
        Random random = new Random();

        for (int i = 0; i < ar.length; i++) {
            ar[i] = random.nextInt(10) - 3;
        }
        System.out.print("Массив целых чисел имеет вид: ");
        System.out.println(Arrays.toString(ar));

        int max = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (max < ar[i]) {
                max = ar[i];
            }
        }
        System.out.println("Максимальный элемент массива: " + max);

        int maxIndex = 0;
        for (int i = 0; i < ar.length; i++) {
            if (max == ar[i]) {
                maxIndex=i;
                System.out.println("Под индексом " + maxIndex + " находится максимальный элемент массива: " + ar[i]);
            }
        }
    }
}
