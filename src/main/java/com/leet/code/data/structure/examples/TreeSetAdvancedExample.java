package com.leet.code.data.structure.examples;

import java.util.TreeSet;

/**
 * Interview Question:
 * Implement a TreeSet in Java and demonstrate additional operations:
 * - Poll and print the first and last elements
 * - Get a subset of the TreeSet
 */

public class TreeSetAdvancedExample {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        // Add elements
        treeSet.add("Java");
        treeSet.add("is");
        treeSet.add("sorted");

        // Poll and print the first and last elements
        for (String s : treeSet) {

        }
        System.out.println("First Element: " + treeSet.pollFirst());
        System.out.println("Last Element: " + treeSet.pollLast());

        // Get a subset of the TreeSet
        System.out.println("Subset: " + treeSet.subSet("is", "sorted"));
    }
}
