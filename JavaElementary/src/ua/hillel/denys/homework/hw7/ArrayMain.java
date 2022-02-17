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

        ArrayCollection arrayCollection = new ArrayCollection();


        System.out.println(arrayCollection.toString());
    }
}
