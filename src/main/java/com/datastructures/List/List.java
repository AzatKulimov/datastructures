package com.datastructures.List;

public interface List<T> {
    int size();
    void add(T object);
    T get (int index);
    void remove (int index);
}
