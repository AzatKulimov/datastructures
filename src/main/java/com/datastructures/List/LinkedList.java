package com.datastructures.List;

public class LinkedList<T> implements List<T> {
    private Node<T> head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public int size() {
        return 0;
    }

    public void add(T object) {
        if(this.head==null){
            this.head=new Node<>(object);
        return;}

        Node<T>var=new Node<>(object);
        Node<T> current=this.head;

        while (current.getNext()!=null){
            current=current.getNext();
        }
                    current.setNext(var);
            size++;
    }

    public T get(int index) {
        return null;
    }

    public void remove(int index) {
        if (index < 1 || index > size())
            throw new IllegalArgumentException("Index must be greater or equal ONE");
        Node<T> variable = head;

        if (variable!=null) {
            for (int i = 0; i <index ; i++) {
                variable = variable.getNext();
            }
        }
    }
}
