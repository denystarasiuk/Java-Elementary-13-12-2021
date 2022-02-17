package ua.hillel.denys.homework.hw3;

import java.util.Arrays;

/**
 * JavaDoc
 * <p>
 * Создайте массив, содержащий 10 первых нечетных чисел.
 * Выведете элементы массива на консоль в одну строку, разделяя запятой.
 *
 * @author Tarasiuk Denys
 */

public class ArrayOfOddNumbers {

    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i + 1;
        }
        System.out.println(Arrays.toString(array));

//        Второй вариант
//        int[] array = new int[10];
//        int i =0;
//        while (i<array.length){
//            array[i] = 2 * i + 1;
//            i++;
//        }
//        System.out.println(Arrays.toString(array));
    }
}
