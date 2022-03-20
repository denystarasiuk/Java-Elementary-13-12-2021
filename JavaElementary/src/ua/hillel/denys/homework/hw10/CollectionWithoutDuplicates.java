package ua.hillel.denys.homework.hw10;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
 */

public class CollectionWithoutDuplicates {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("One");
        list.add("Five");

        System.out.println(list);
        System.out.println(noDuplicates(list));

    }

    public static ArrayList noDuplicates(List values) {
        return new ArrayList(new HashSet(values));
    }
}
