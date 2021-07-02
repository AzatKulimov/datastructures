package com.datastructures.stack;

import com.datastructures.List.Node;

public class Noder<T> {
    private Noder<T> next;
    private final T object;
    private int a;


    public Noder(T object) {
        this.object = object;
    }

    public Noder<T> getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "Noder{" +
                "next=" + next +
                ", object=" + object +
                '}';
    }

    public void setNext(Noder<T> next) {
        this.next = next;
    }

    public T getObject() {
        return object;
    }
}
