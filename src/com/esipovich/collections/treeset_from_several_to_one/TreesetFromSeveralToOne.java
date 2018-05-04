package com.esipovich.collections.treeset_from_several_to_one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Artem Esipovich 5/4/2018
 *
 * Additional code,Soldier!
 * Given one input string as "1 2 3 4 5;6 7 8 9 10;11 12 13 14 15"(it's 3 lists)
 * 1.String[] sets consists of these lists. Add all elements from each list to correct set(see the comments in the code) sets[0] = {"1 2 3 4 5"} - its string and so on
 * *use split(" ") to separate elements from string
 * 2.On unionTreeLargeNumber(Set<Integer> set1,Set<Integer> set2,Set<Integer> set3):
 *      1)In each Set find the maximum element
 *      2)create TreeSet, add the resulting elements to TreeSet
 *      3)return this TreeSet with elements sorted in descending order:
 *           *you can use special method from class TreeSet or rather NavigableSet interface to change the order of storage on the reverse
 * 3.Using System.out.println() print elements of resultTreeSet
 */

public class TreesetFromSeveralToOne {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] sets = reader.readLine().split(";");

        Set<Integer> set1 = new HashSet<>();
        //your code(add elements to set1 from sets[0])
        for (String element : sets[0].split(" ")) {
            set1.add(Integer.valueOf(element));
        }

        Set<Integer> set2 = new HashSet<>();
        //your code(add elements to set2 from sets[1])
        for (String element : sets[1].split(" ")) {
            set2.add(Integer.valueOf(element));
        }

        Set<Integer> set3 = new HashSet<>();
        //your code(add elements to set3 from sets[2])
        for (String element : sets[2].split(" ")) {
            set3.add(Integer.valueOf(element));
        }


        Set<Integer> resultTreeSet = unionTreeLargeNumber(set1,set2,set3);

        //print elements of resultTreeSet(using System.out.printLn()) below
        for (Integer element : resultTreeSet) {
            System.out.println(element);
        }


    }

    public static TreeSet<Integer> unionTreeLargeNumber(Set<Integer> set1, Set<Integer> set2, Set<Integer> set3){
        TreeSet<Integer> resultSet = new TreeSet<>();
        resultSet.add(Collections.max(set1));
        resultSet.add(Collections.max(set2));
        resultSet.add(Collections.max(set3));
        return (TreeSet<Integer>) resultSet.descendingSet();
    }
}
