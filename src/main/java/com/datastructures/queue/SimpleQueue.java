package com.datastructures.queue;

public class SimpleQueue<T> extends AbstractQueue<T> {

    public SimpleQueue(int size) {
        super(size);
    }

    @Override
    public void enqueue(T object) {
        if((this.back+1)%data.length==front){
            throw new IllegalStateException("The Queue is full");
            }
        else if (size()==0){
            front++;
            back++;
            data[back]=object;

        }
            else {
                back++;
                data[back]=object;
        }
    }

    @Override
    public T dequeue() {
        return null;
    }
}
