package com.datastructures.bst;

public interface Tree<T> {

    void insert(T data);
    T minValue();
    T maxValue();
    void traverse();
    T delete(Node node);

}
