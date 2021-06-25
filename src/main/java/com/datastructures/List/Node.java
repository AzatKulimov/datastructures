package com.datastructures.List;

public class Node<T> {
    private Node<T> next;
    private final T object;

    public Node(T object) {
        this.object = object;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getObject() {
        return object;
    }
}
