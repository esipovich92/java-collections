package com.esipovich.collections.modify_treemap;

import java.util.*;

/**
 * @author Artem Esipovich 5/9/2018
 *
 * Modify and return the given map as follows:
 * if the first key % 2 != 0 return sub map from First Key inclusive to FirstKey+4 inclusive in descending order
 * else return sub map from LastKey-4 inclusive to the Last Key inclusive in descending order
 *
 * 1:one 2:two 3:three 4:four 5:five 6:six 7:seven
 */

public class ModifyTreeMap {
    private static TreeMap<Integer, String> testMap = new TreeMap<>();
    static {
        testMap.put(1, "one");
        testMap.put(2, "two");
        testMap.put(3, "three");
        testMap.put(4, "four");
        testMap.put(5, "five");
        testMap.put(6, "six");
        testMap.put(7, "seven");
    }

    public static void main(String[] args) {
        getSubMap(testMap).forEach((k, v) -> System.out.println(k + " : " + v));
    }

    private static NavigableMap<Integer, String> getSubMap(NavigableMap<Integer, String> map){
        List<Integer> keys = new ArrayList<>(map.keySet());
        if (keys.get(0) % 2 != 0){
            int fromKey = keys.get(0);
            int toKey = fromKey + 4;
            return map.subMap(fromKey, true, toKey, true).descendingMap();
        } else {
            int toKey = keys.get(keys.size() - 1);
            int fromKey = toKey - 4;
            return map.subMap(fromKey, true, toKey, true).descendingMap();
        }
    }

}
