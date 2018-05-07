package com.esipovich.collections.spliterator_sqrt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

/**
 * @author Artem Esipovich 5/7/2018
 *
 * On spliteratorWork( List<Double> lst ):
 * - using Spliterator add to List<Double> sqrts all square roots of items from lst ,if this item greater than 1
 * - use Math.sqrt(number) to find square root : Math.sqrt(4)-> 2.0
 * On print(List<Double> list):
 * - get spliterator() of given list
 * - divide spliterator into 2 parts ( use spliterator.trySplit())
 * - print all items which >=2 from first part (use .println())
 * - print empty string
 * - print all items which >=10 from second part (use .println())
 *
 * 4 4 4 100 100 100
 */

public class SpliteratorSqrt {

    public static void main(String[] args) {
        print(spliteratorWork(Arrays.asList(4.0, 4.0, 4.0, 100.0, 100.0, 100.0)));
    }

    public static List<Double> spliteratorWork(List<Double> lst){
        List<Double> sqrs = new ArrayList<>();
        Spliterator<Double> spliterator = lst.spliterator();
        while (spliterator.tryAdvance(e -> sqrs.add(Math.sqrt(e))));
        return sqrs;
    }
    public static void print(List<Double> list){
        Spliterator<Double> spliterator = list.spliterator();
        Spliterator<Double> firstSpliterator = spliterator.trySplit();
        while (firstSpliterator.tryAdvance(e -> {if (e >= 2) {
            System.out.println(e);
        } }));
        System.out.println();
        spliterator.forEachRemaining(e -> {if(e >= 10) {
            System.out.println(e);
        }});
    }
}
