package com.leet.code.data.structure.examples;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Interview Question:
 * Implement a Queue in Java and demonstrate additional operations:
 * - Peek and print the front element
 * - Check if the Queue is empty
 */

public class QueueAdvancedExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Add elements
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        // Peek and print the front element
        System.out.println("Front Element: " + queue.peek());

        // Check if the Queue is empty
        System.out.println("Is the Queue empty? " + queue.isEmpty());
    }
}
