package com.datastructures.stacks.impl;

public interface MyStack<T> {
    void push(Object t);
    Object pop();
    boolean contains(Object t);
    Object access(Object t);
    int size();
}
