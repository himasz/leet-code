package com.leet.code.data.structure.examples; /**
 * Interview Question: Implement a Queue in Java and demonstrate its basic usage.
 */
import java.util.Comparator;
import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        System.out.println("Queue Contents: " + queue);
    }
}
