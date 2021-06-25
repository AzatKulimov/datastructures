package com.datastructures.queue;

import java.util.Arrays;

public abstract class AbstractQueue<T> implements Queue<T> {
    protected T[] data;
    protected int front;
    protected int back;


    public AbstractQueue(int size) {
        this.data=(T[]) new Object[size];
        this.front=-1;
        this.back=-1;
    }


    public  int size (){
        if (front==-1 && back == -1)
            return 0;
        else
            return back-front+1;
    }
    @Override
    public String toString() {
        return "AbstractQueue{" +
                "data=" + Arrays.toString(data) +
                ", front=" + front +
                ", back=" + back +
                '}';
    }
}
