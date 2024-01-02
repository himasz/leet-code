package com.leet.code.data.structure.examples;
/**
 * Interview Question: Implement a LinkedList in Java and demonstrate its basic usage.
 */
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("is");
        linkedList.add("flexible");
        System.out.println("LinkedList Contents: " + linkedList);
    }
}
