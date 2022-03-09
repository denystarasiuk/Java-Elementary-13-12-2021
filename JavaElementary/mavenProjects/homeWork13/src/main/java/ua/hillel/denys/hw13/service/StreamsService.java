package ua.hillel.denys.hw13.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsService {

    // посчитать среденее значения всех чисел
    public static Double calculateTheAverageOfAllNumbers(List<Integer> list) {
        return list.stream()
                .mapToInt(el -> el).average().getAsDouble();
    }

    // привести все стринги в UPPERCASE и вернуть коллекцию List<Pair>
    public static Map<String, String> upperCase(List<String> str) {
        return str.stream().
                collect(Collectors.toMap(s -> s, String::toUpperCase));
    }
//    public static List<Pair>upperCase(List<String>str){
//        List<Pair> pairList = new ArrayList<>();
//        for (String s : str) {
//            pairList.add(new Pair(s, s.toUpperCase()));
//        }
//        return pairList;
//    }

    // отфильтровать и вывести на экран все значения, которые написаны в loverCase and length = 4
    public static List<String> filterLoverCase(List<String> strings) {
        return strings.stream()
                .filter(s -> s.equals(s.toLowerCase()) && s.length() == 4)
                .collect(Collectors.toList());
    }
}
