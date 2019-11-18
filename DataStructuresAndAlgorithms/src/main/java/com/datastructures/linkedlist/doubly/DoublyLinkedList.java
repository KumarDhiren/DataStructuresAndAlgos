package com.datastructures.linkedlist.doubly;

import com.datastructures.linkedlist.node.Node;

public class DoublyLinkedList<E extends Comparable> implements DoublyList<E>{

    private DoublyLinkedNode<E> first;
    private DoublyLinkedNode<E> last;
    private int size = 0;

    private void linkFirst(E e) {
        final DoublyLinkedNode<E> tempFirst = first;
        final DoublyLinkedNode<E> newNode = new DoublyLinkedNode<>(null,e,tempFirst);
        first = newNode;
        if(tempFirst == null)
            last = newNode;
        else
            tempFirst.prev = newNode;
        size++;
    }

    private void linkLast(E e) {
        final DoublyLinkedNode<E> tempLast = last;
        final DoublyLinkedNode<E> newNode = new DoublyLinkedNode<>(tempLast,e,null);
        last = newNode;
        if(tempLast == null)
            first = newNode;
        else
            tempLast.next = newNode;
        size++;
    }

    private void linkBefore(E e, DoublyLinkedNode<E> succ) {
        final DoublyLinkedNode<E> prev = succ.prev;
        final DoublyLinkedNode<E> newNode = new DoublyLinkedNode<>(prev,e,succ);
        succ.prev = newNode;
        if(prev == null)
            first = newNode;
        else
            prev.next = newNode;
        size++;
    }

    private boolean checkPositionIndex(int index) {
        return index >= 0 && index <= size;
    }

    private void checkElementIndex(int index) {
        if(!checkPositionIndex(index))
            throw new IndexOutOfBoundsException("Index beyond the size");
    }

    private DoublyLinkedNode<E> nodeAtIndex(int index) {
        DoublyLinkedNode<E> node = first;
        for(int start = 0 ; start < index && node != null; start++) {
            node = node.next;
        }
        return node;
    }

    @Override
    public void addFirst(E e) {
        linkFirst(e);
    }

    @Override
    public void addLast(E e) {
        linkLast(e);
    }

    @Override
    public boolean add(E e) {
        linkFirst(e);
        return true;
    }

    @Override
    public void add(int index, E e) {
        checkElementIndex(index);
        if(size == index)
            linkLast(e);
        else
            linkBefore(e, nodeAtIndex(index));
    }

    @Override
    public E removeFirst() {
        return null;
    }

    @Override
    public E removeLast() {
        return null;
    }

    @Override
    public E remove(E e) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    public void print() {
        System.out.println("Head : " + first);
        DoublyLinkedNode currentNode = first;
        System.out.print(currentNode);
        while (currentNode != null) {
            System.out.print(" ------> ");
            currentNode = currentNode.next;
            System.out.print(currentNode);
        }
    }
}
