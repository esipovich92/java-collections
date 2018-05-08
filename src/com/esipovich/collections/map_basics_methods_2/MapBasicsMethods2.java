package com.esipovich.collections.map_basics_methods_2;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Artem Esipovich 5/8/2018
 *
 * Given an array of strings,
 * - On wordCount() : return a
 * SortedMap<String, Integer> with a key for each different string, with the value the number of times that string appears in the array.
 * - On printMap(): Using System.out.println() print all items of the Map ("key : value")
 *
 * a b b c d a b
 */

public class MapBasicsMethods2 {

    public static void main(String[] args) {
        printMap(wordCount(new String[]{"a", "b", "b", "c", "d", "a", "b"}));
    }

    private static SortedMap<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> occurancies = new TreeMap<>();
        for (String s : strings) {
            if (occurancies.get(s) == null) {
                occurancies.put(s, 1);
            } else {
                occurancies.put(s, occurancies.get(s) + 1);
            }
        }
        return (SortedMap<String, Integer>) occurancies;
    }
    private static void printMap(Map<String, Integer> map){
        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
