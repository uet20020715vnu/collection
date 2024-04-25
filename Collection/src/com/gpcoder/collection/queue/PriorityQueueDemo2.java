package com.gpcoder.collection.queue;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo2 {
    public static void main(String[] args) {
        // Init PriorityQueue
        Queue<com.gpcoder.collection.queue.Book> queue = new PriorityQueue<com.gpcoder.collection.queue.Book>();
        // Creating Books
        com.gpcoder.collection.queue.Book b1 = new com.gpcoder.collection.queue.Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        com.gpcoder.collection.queue.Book b2 = new com.gpcoder.collection.queue.Book(233, "Operating System", "Galvin", "Wiley", 6);
        com.gpcoder.collection.queue.Book b3 = new com.gpcoder.collection.queue.Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        // Adding Books to the queue
        queue.offer(b1);
        queue.offer(b2);
        queue.offer(b3);
        System.out.println("Traversing the queue elements:");
        // Traversing queue elements
        for (com.gpcoder.collection.queue.Book b : queue) {
            System.out.println(b);
        }
        System.out.println("After removing one book record:");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
