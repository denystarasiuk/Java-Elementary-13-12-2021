package ua.hillel.denys.hw13;

/**
 * JavaDoc
 *
 * 1 - Имеется коллекция из Integer, использую стримы посчитать среденее значения всех чисел
 * 2 - Имеется коллекция из String, привести все стринги в UPPERCASE и вернуть коллекцию List<Pair>
 *     in: "one", "two", ...
 *     out: {"one":"ONE"}, {"two", "TWO"}, ...
 * 3 - Имеется коллекция из String, отфильтровать и вывести на экран все значения, которые написаны
 * в loverCase and length = 4
 *
 * ps для проверки написать тесты
 *
 * @author Tarasiuk Denys
 */

import ua.hillel.denys.hw13.service.StreamsService;
import ua.hillel.denys.hw13.utils.GenCollection;

import java.util.List;

public class StreamsMain {

    public static void main(String[] args) {

        System.out.println("Среденее значения всех чисел коллекции");
        List<Integer>list = new GenCollection().getList();
        System.out.println("Коллекция имеет вид: " + list);
        System.out.println("Среденее значения всех чисел коллекции: " + StreamsService.calculateTheAverageOfAllNumbers(list));
        System.out.println("==========");

        System.out.println("Привести все стринги в UPPERCASE и вернуть коллекцию List<Pair>");
        List<String>str = new GenCollection().getStr();
        System.out.println(StreamsService.upperCase(str));
        System.out.println("==========");

        System.out.println("Отфильтровать и вывести на экран все значения, которые написаны в loverCase and length = 4");
        List<String>strings = new GenCollection().getString();
        System.out.println(StreamsService.filterLoverCase(strings));


    }
}
