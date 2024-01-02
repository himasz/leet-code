In Java, comparators are objects that provide an ordering for a collection of objects. They are primarily used in
sorting operations, allowing you to define custom sorting logic for objects that don't naturally have a natural
ordering. Comparators are essential when working with classes that implement the `Comparable` interface or when sorting
collections of objects.

There are two main ways to define comparators in Java:

1. `Using the `Comparable` Interface:`
    - The `Comparable` interface is implemented by classes whose objects can be compared with each other.
    - The `compareTo` method is defined in the `Comparable` interface and is used for natural ordering.
    - Example:

    ```java
    public class MyClass implements Comparable<MyClass> {
        private int value;

        public MyClass(int value) {
            this.value = value;
        }

        @Override
        public int compareTo(MyClass other) {
            // Define the natural ordering logic here
            return Integer.compare(this.value, other.value);
        }
    }
    ```

2. `Using the `Comparator` Interface:`
    - The `Comparator` interface allows you to define custom comparison logic separately from the class being compared.
    - It is particularly useful when you want to sort objects in multiple ways without modifying their class.
    - Example:

    ```java
    import java.util.Comparator;

    public class MyClass {
        private int value;

        public MyClass(int value) {
            this.value = value;
        }

        // Getters and other methods...

        public static Comparator<MyClass> myComparator = Comparator.comparingInt(obj -> obj.value);
    }
    ```

    - You can use this comparator in sorting operations:

    ```java
    List<MyClass> myList = new ArrayList<>();
    // Add elements to myList
    myList.sort(MyClass.myComparator);
    ```

In addition to the built-in `Comparator` methods provided by the `Comparator` interface, Java 8 introduced several
utility methods in the `Comparator` interface to make it easier to create comparators. Some examples include:

- `Comparator.naturalOrder()`: Returns a comparator that imposes the natural ordering of a class.
- `Comparator.reverseOrder()`: Returns a comparator that imposes the reverse of the natural ordering.
- `Comparator.comparing(...)`: Returns a comparator that compares objects based on a specified key extracted from the
  objects using a function.

These comparators allow for more concise and readable code when defining custom sorting logic.

```java

public static void main(String[]args){
        // Create two sets for comparison with custom ordering
        Set<String> set1=new TreeSet<>(Comparator.reverseOrder());
        Set<String> set2=new TreeSet<>(Comparator.reverseOrder());

        // Populate sets with elements
        set1.add("apple");
        set1.add("orange");
        set1.add("banana");

        set2.add("orange");
        set2.add("banana");
        set2.add("apple");

        // Compare sets based on custom ordering
        int result=set1.toString().compareTo(set2.toString());

        System.out.println("Comparison result: "+result);

        }
```

The main differences between a `PriorityQueue` and a normal `Queue` in Java lie in the way elements are ordered and
dequeued:

1. `Ordering:`
    - In a normal `Queue`, elements are stored and retrieved in a first-in, first-out (FIFO) order. The element that has
      been in the queue the longest is the first one to be dequeued.
    - In a `PriorityQueue`, elements are ordered based on their natural order (if they implement the `Comparable`
      interface) or according to a specified comparator. The element with the highest priority is dequeued first.

2. `Dequeueing:`
    - In a normal `Queue`, elements are dequeued in the order they were added (FIFO).
    - In a `PriorityQueue`, elements are dequeued based on their priority. The element with the highest priority is
      dequeued first. If two elements have the same priority, their order is determined by their natural order or the
      provided comparator.

3. `Use Cases:`
    - A normal `Queue` is suitable for scenarios where elements should be processed in the order they arrive, and the
      order of insertion is significant.
    - A `PriorityQueue` is used when elements have different priorities, and you want to process higher-priority
      elements before lower-priority ones.

4. `Complexity:`
    - The time complexity for enqueue (addition) and dequeue (removal) operations in a normal `Queue` is O(1).
    - The time complexity for enqueue and dequeue operations in a `PriorityQueue` is O(log n), where n is the number of
      elements in the queue. The priority queue uses a heap-based data structure to maintain the order efficiently.

`Example:`

Normal Queue:

```java
import java.util.LinkedList;
import java.util.Queue;

Queue<String> normalQueue=new LinkedList<>();
        normalQueue.add("First");
        normalQueue.add("Second");
        normalQueue.add("Third");
        System.out.println(normalQueue.poll());  // Output: First
```

PriorityQueue:

```java
import java.util.PriorityQueue;

PriorityQueue<String> priorityQueue=new PriorityQueue<>();
        priorityQueue.add("High Priority");
        priorityQueue.add("Low Priority");
        priorityQueue.add("Medium Priority");
        System.out.println(priorityQueue.poll());  // Output: High Priority
```

In summary, while a normal `Queue` follows a simple FIFO ordering, a `PriorityQueue` allows elements to be dequeued
based on their priority, offering a more flexible approach to managing elements with different levels of importance or
urgency.