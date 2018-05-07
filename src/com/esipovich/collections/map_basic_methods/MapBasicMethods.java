package com.esipovich.collections.map_basic_methods;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Artem Esipovich 5/7/2018
 *
 * Modify and return the given map as follows:
 * - if the key "a" has a value, set the key "b" to have that same value.
 * - In all cases remove the key "c",leaving the rest of the map unchanged
 */

public class MapBasicMethods {
    private static Map<String, String> map = new HashMap<>();

    static {
        map.put("a", "abstraction");
        map.put("b", "boolean");
        map.put("c", "xyz");
    }

    public static void main(String[] args) {
        mapShare(map).forEach((k, v) -> System.out.println(k +":" + v));
    }

    public static Map<String, String> mapShare(Map<String, String> map) {
        String aValue = map.get("a");
        if (aValue != null){
            map.put("b", aValue);

        }
        map.remove("c");
        return map;
    }
}
