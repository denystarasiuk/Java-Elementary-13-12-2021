package ua.hillel.denys.homework.hw7;

/**
 * JavaDoc
 *
 * Реализовать простую коллекцию для String на базе массива.
 * Реализовать следующие методы для работы с коллекцией:
 *
 * 1. public boolean add(int index, String value);
 * 2. public boolean add(String value);
 * 3. public boolean delete(int index);
 * 4. public boolean delete(String value);
 * 5. public String get(int index);
 *
 * @author Tarasiuk Denys
 */

public class ArrayMain {

    public static void main(String[] args) {

        ArrayCollection array = new ArrayCollection();
        System.out.println("Заполняем массив");
        array.add("ValueOne");
        array.add("ValueTwo");
        array.add("ValueThree");
        array.add("ValueFour");
        array.add("ValueFive");
        System.out.println(array.toString());
        System.out.println("==========");

        System.out.println("Добавляем значение в массив");
        array.add("ValueSix");
        System.out.println(array.toString());
        System.out.println("==========");

        System.out.println("Добавляем значение в массив по индексу");
        array.add(2, "One");
        array.add(3, "Two");
        array.add(4, "Three");
        array.add(5, "Four");
//        array.add(6, "Five");
        System.out.println(array.toString());
        System.out.println("==========");

        System.out.println("Удаляем значение в массиве по индексу");
        array.delete(2);
        System.out.println(array.toString());
        System.out.println("==========");

        System.out.println("Удаляем значение в массиве");
        array.delete("ValueFour");
        System.out.println(array.toString());
        System.out.println("==========");

        System.out.println("Вызываем значение по индексу из массива");
        System.out.println(array.get(5));
    }
}
