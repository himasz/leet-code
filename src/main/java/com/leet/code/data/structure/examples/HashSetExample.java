package com.leet.code.data.structure.examples; /**
 * Interview Question: Implement a HashSet in Java and demonstrate its basic usage.
 */
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        System.out.println("HashSet Contents: " + hashSet);
    }
}
