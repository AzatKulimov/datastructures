package com.datastructures.stack;

import java.util.Arrays;

public class Simplestack<T> implements Stack<T> {
  private T[] objects;
  private int pointer;

  public Simplestack(){
      this.objects=(T[]) new Object[10];
      pointer=0;
  }


    @Override
    public void push(T object) {
        this.objects[pointer++]=object;
    }


    @Override
    public T pop() {
        return this.objects[--pointer];
    }

    @Override
    public String toString() {
        return "Simplestack{" +
                "objects=" + Arrays.toString(objects) +
                ", pointer=" + pointer +
                '}';
    }
}
