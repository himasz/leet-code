package com.leet.code.data.structure.examples;

import java.util.LinkedList;

/**
 * Interview Question:
 * Implement a LinkedList in Java and demonstrate additional operations:
 * - Add elements at the beginning and end
 * - Remove elements from the beginning and end
 * - Check if the LinkedList is empty
 */

public class LinkedListAdvancedExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements
        linkedList.add("Java");
        linkedList.add("is");
        linkedList.add("flexible");

        // Add elements at the beginning
        linkedList.addFirst("Programming");
        // Add elements at the end
        linkedList.addLast("Language");

        // Remove elements
        linkedList.removeFirst();
        linkedList.removeLast();

        // Check if the LinkedList is empty
        System.out.println("Is the LinkedList empty? " + linkedList.isEmpty());

        // Display elements
        System.out.println("LinkedList Contents: " + linkedList);
    }
}
