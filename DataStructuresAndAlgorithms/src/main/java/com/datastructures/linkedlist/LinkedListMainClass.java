package com.datastructures.linkedlist;

import com.datastructures.linkedlist.impl.LinkedListV2;

import java.io.IOException;

public class LinkedListMainClass {

    public static void main(String[] args) throws IOException {
        LinkedListV2<Integer> linkedListV2 = new LinkedListV2<>();
        linkedListV2.insert(10);
        linkedListV2.insert(12);
        linkedListV2.insert(13);
        linkedListV2.insert(14);
        linkedListV2.insertAt(11, 1);
        //linkedListV2.print();
        linkedListV2.remove();
        linkedListV2.removeAt(3);
        linkedListV2.remove(12);
        //linkedListV2.print();
        linkedListV2.remove(13);
        //linkedListV2.print();
        //linkedListV2.clear();
        linkedListV2.print();
        System.out.println("Element at 2nd positon is : " + linkedListV2.get(1));
        System.err.println(linkedListV2.size());
        reverse();
    }

    private static void reverse() throws IOException {
        LinkedListV2<Integer> linkedListV2 = new LinkedListV2<>();
        linkedListV2.insert(10);
        linkedListV2.insert(12);
        linkedListV2.insert(13);
        linkedListV2.insert(14);

        linkedListV2.print();

        linkedListV2.reverse();
        linkedListV2.print();
    }

}