package com.leet.code.data.structure.examples;

import java.util.PriorityQueue;

/**
 * Interview Question:
 * Implement a Priority Queue in Java using the built-in PriorityQueue class
 * with a custom class 'Task' representing tasks with priority and description.
 * Demonstrate insertion, removal, and iteration through the Priority Queue.
 */

class Task implements Comparable<Task> {
    private int priority;
    private String description;

    public Task(int priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    @Override
    public int compareTo(Task other) {
        // Higher priority tasks come first
        return Integer.compare(other.priority, this.priority);
    }

    @Override
    public String toString() {
        return "Task{" +
                "priority=" + priority +
                ", description='" + description + '\'' +
                '}';
    }
}

public class PriorityQueueCustomClassExample {
    public static void main(String[] args) {
        PriorityQueue<Task> priorityQueue = new PriorityQueue<>();

        // Insert tasks with different priorities
        priorityQueue.add(new Task(3, "Complete urgent report"));
        priorityQueue.add(new Task(1, "Attend important meeting"));
        priorityQueue.add(new Task(2, "Review project proposal"));

        // Display tasks in order of priority
        System.out.println("Tasks in Priority Queue:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
