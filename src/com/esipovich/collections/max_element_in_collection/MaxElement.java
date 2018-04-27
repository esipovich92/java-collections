package com.esipovich.collections.max_element_in_collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Artem Esipovich 24.04.2018
 *
 * You need to find the max element in the collection. Just write your own implementation of the method
 */

public class MaxElement {

    public static void main(String[] args) {
        System.out.println(maxElem(Arrays.asList(847, 271, 663, 473, 376, 133, 693, 13, 382, 879)));
    }

    public static Integer maxElem(List<Integer> list){
        return Collections.max(list);
    }
}
