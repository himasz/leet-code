package com.leet.code.data.structure.examples;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Interview Question:
 * Implement a Deque in Java and demonstrate additional operations:
 * - Add elements at both ends
 * - Remove elements from both ends
 */

public class DequeAdvancedExample {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        // Add elements at both ends
        deque.addFirst("First");
        deque.addLast("Last");

        // Remove elements from both ends
        System.out.println("Removed from the front: " + deque.removeFirst());
        System.out.println("Removed from the back: " + deque.removeLast());
    }
}
