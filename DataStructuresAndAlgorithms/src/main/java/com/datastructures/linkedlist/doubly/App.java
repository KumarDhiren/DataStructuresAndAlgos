package com.datastructures.linkedlist.doubly;

public class App {

    public static void main(String[] args) {
        DoublyLinkedList<Integer> linkedList = new DoublyLinkedList<>();
        linkedList.addFirst(10);
        linkedList.addLast(13);
        linkedList.add(1,12);
        linkedList.add(1,11);
        linkedList.add(10);
        System.out.println(linkedList.size());
        linkedList.print();
    }

}
