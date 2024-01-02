package com.leet.code.data.structure.examples; /**
 * Interview Question: Implement a PriorityQueue in Java and demonstrate its basic usage.
 */
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(3);
        priorityQueue.add(1);
        priorityQueue.add(2);
        System.out.println("PriorityQueue Contents: " + priorityQueue);
    }
}
