package ua.hillel.denys.homework.hw3;

import java.util.Arrays;
import java.util.Random;

/**
 * JavaDoc
 * <p>
 * Поменять наибольший и наименьший элементы массива местами.
 * Пример: дан массив {4, -5, 0, 6, 8}. После замены будет выглядеть {4, 8, 0, 6, -5}.
 *
 * @author Tarasiuk Denys
 */

public class SwapLargestAndSmallestElements {

    public static void main(String[] args) {

        int size = 5;
        int[] ar = new int[size];
        Random random = new Random();

        for (int i = 0; i < ar.length; i++) {
            ar[i] = random.nextInt(20) - 5;
        }
        System.out.print("Массив целых чисел имеет вид: ");
        System.out.println(Arrays.toString(ar));

        int min = ar[0];
        int max = ar[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < ar.length; i++) {
            if (min > ar[i]) {
                min = ar[i];
                minIndex = i;
            }
        }

        for (int i = 0; i < ar.length; i++) {
            if (max < ar[i]) {
                max = ar[i];
                maxIndex = i;
            }
        }

        ar[maxIndex] = min;
        ar[minIndex] = max;

        System.out.println("Наибольший и наименьший элементы массива поменялись местами: " + Arrays.toString(ar));
    }
}
