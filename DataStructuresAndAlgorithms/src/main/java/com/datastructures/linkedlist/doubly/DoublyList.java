package com.datastructures.linkedlist.doubly;

public interface DoublyList<E> {

    void addFirst(E e);
    void addLast(E e);
    boolean add(E e);
    void add(int index , E e);

    E removeFirst();
    E removeLast();
    E remove(E e);

    int size();

}
