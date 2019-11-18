package com.datastructures.linkedlist.doubly;

public class DoublyLinkedNode<E extends Comparable> {


    DoublyLinkedNode<E> next;
    E item;
    DoublyLinkedNode<E> prev;

    public DoublyLinkedNode(DoublyLinkedNode<E> prev, E item, DoublyLinkedNode<E> next) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "[" + item +
                ']';
    }
}
