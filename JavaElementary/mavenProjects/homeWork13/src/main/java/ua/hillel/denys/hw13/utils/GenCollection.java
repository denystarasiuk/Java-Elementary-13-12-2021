package ua.hillel.denys.hw13.utils;


import java.util.ArrayList;
import java.util.List;

public class GenCollection {

    public List<Integer>getList(){
        List<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(18);
        list.add(12);
        list.add(100);
        list.add(63);
        list.add(7);
        list.add(1);
        list.add(77);
        return list;
    }

    public List<String>getStr(){
        List<String>str = new ArrayList<>();
        str.add("one");
        str.add("two");
        str.add("three");
        str.add("four");
        str.add("five");
        return str;
    }

    public List<String>getString(){
        List<String>strings = new ArrayList<>();
        strings.add("One");
        strings.add("two");
        strings.add("thrEE");
        strings.add("FouR");
        strings.add("five");
        strings.add("six");
        strings.add("seven");
        return strings;
    }

}
