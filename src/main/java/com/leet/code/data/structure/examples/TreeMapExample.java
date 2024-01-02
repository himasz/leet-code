package com.leet.code.data.structure.examples; /**
 * Interview Question: Implement a TreeMap in Java and demonstrate its basic usage.
 */
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);
        System.out.println("TreeMap Contents: " + treeMap);
    }
}
