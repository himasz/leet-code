package com.leet.code.data.structure.examples; /**
 * Interview Question: Implement a Deque in Java and demonstrate its basic usage.
 */
import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.addFirst("First");
        deque.addLast("Last");
        System.out.println("Deque Contents: " + deque);
    }
}
