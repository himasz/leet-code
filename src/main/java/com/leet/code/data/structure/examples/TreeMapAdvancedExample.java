package com.leet.code.data.structure.examples;

import java.util.TreeMap;

/**
 * Interview Question:
 * Implement a TreeMap in Java and demonstrate additional operations:
 * - Retrieve and print the first and last keys
 * - Get a submap of the TreeMap
 */

public class TreeMapAdvancedExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add elements
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(2, "Two");

        // Retrieve and print the first and last keys
        System.out.println("First Key: " + treeMap.firstKey());
        System.out.println("Last Key: " + treeMap.lastKey());

        // Get a submap of the TreeMap
        System.out.println("Submap: " + treeMap.subMap(1, 3));
    }
}
