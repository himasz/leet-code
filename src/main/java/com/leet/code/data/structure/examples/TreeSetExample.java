package com.leet.code.data.structure.examples; /**
 * Interview Question: Implement a TreeSet in Java and demonstrate its basic usage.
 */
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Java");
        treeSet.add("is");
        treeSet.add("sorted");
        System.out.println("TreeSet Contents: " + treeSet);
    }
}
