package com.datastructures.queues;

import com.datastructures.queues.usingLinkedlist.Queue;

public class App {

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue();
        System.out.println("Queue Size : "+queue.size());
        System.out.println("Queue Empty : "+queue.isEmpty());

        queue.enqueue(10);
        queue.enqueue(100);
        queue.enqueue(100);

        System.out.println("Queue Size : "+queue.size());
        System.out.println("Queue Empty : "+queue.isEmpty());

        queue.dequeue();
        queue.dequeue();

        System.out.println("Queue Size : "+queue.size());
        System.out.println("Queue Empty : "+queue.isEmpty());

        queue.dequeue();
        queue.dequeue();

        System.out.println("Queue Size : "+queue.size());
        System.out.println("Queue Empty : "+queue.isEmpty());

    }

}
