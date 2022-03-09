package ua.hillel.denys.hw13.service;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class StreamsServiceTest {

    @Test
    void calculateTheAverageOfAllNumbersPositive() {
        List<Integer>list = Arrays.asList(1,2,3);
        assertEquals(2, StreamsService.calculateTheAverageOfAllNumbers(list));
    }

    @Test
    void calculateTheAverageOfAllNumbersNegative() {
        List<Integer>list = Arrays.asList(1,2,3);
        assertNotEquals(3, StreamsService.calculateTheAverageOfAllNumbers(list));
    }

    @Test
    void upperCasePositive() {
        List<String> str = Arrays.asList("one", "two", "three");
        Map<String,String> str1 = StreamsService.upperCase(str);
        Map<String,String> str2 = new HashMap<>();
        str2.put("one", "ONE");
        str2.put("two", "TWO");
        str2.put("three", "THREE");
        assertEquals(str1, str2);
    }

    @Test
    void upperCaseNegative() {
        List<String> str = Arrays.asList("one", "two", "three");
        Map<String,String> str1 = StreamsService.upperCase(str);
        Map<String,String> str2 = new HashMap<>();
        str2.put("one", "one");
        str2.put("two", "two");
        str2.put("three", "three");
        assertNotEquals(str1, str2);
    }

    @Test
    void filterLoverCasePositive() {
        List<String> strings = Arrays.asList("One", "two", "three", "fouR", "five");
        assertEquals("[five]", StreamsService.filterLoverCase(strings).toString());
    }

    @Test
    void filterLoverCaseNegative() {
        List<String> strings = Arrays.asList("One", "two", "three", "fouR", "five");
        assertNotEquals("[One, two, three, fouR]", StreamsService.filterLoverCase(strings).toString());
    }
}