package ua.hillel.denys.homework.hw3;

import java.util.Arrays;
import java.util.Random;

/**
 * JavaDoc
 * <p>
 * Дан массив размерности N, найти наименьший элемент массива и
 * вывести на консоль (если наименьших элементов несколько — вывести их все).
 *
 * @author Tarasiuk Denys
 */

public class SmallestElementOfTheArray {

    public static void main(String[] args) {

        int size = 10;
        int[] ar = new int[size];
        Random random = new Random();

        for (int i = 0; i < ar.length; i++) {
            ar[i] = random.nextInt(10) - 3;
        }
        System.out.print("Массив целых чисел имеет вид: ");
        System.out.println(Arrays.toString(ar));

        int min = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (min > ar[i]) {
                min = ar[i];
            }
        }
        System.out.println("Минимальный элемент массива: " + min);

        int minIndex = 0;
        for (int i = 0; i < ar.length; i++) {
            if (min == ar[i]) {
                minIndex=i;
                System.out.println("Под индексом " + minIndex + " находится минимальный элемент массива: " + ar[i]);
            }
        }
    }
}
