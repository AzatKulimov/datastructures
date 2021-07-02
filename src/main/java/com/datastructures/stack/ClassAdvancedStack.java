package com.datastructures.stack;

public class ClassAdvancedStack<T> implements AdvancedStack<T> {
    private T [] objects;
    private int pointer;

public ClassAdvancedStack(int size){
    this.objects=(T[]) new Object[size];
    this.pointer=0;
}

    @Override
    public boolean contains(T object) {
        for (int i = 0; i < pointer; i++) {
            if (objects[i].equals(object))
                return true;
        }
        return false;
    }

    @Override
    public T access(T object) {
        while (pointer > 0) {
            T cache = pop();
            if (object.equals(cache))
                return cache;
        }

        throw new IllegalArgumentException("Object not found: " + object);
    }

    @Override
    public void push(T object) {
      if(objects.length-1==pointer)
          System.out.println("Overloaded Stack. MAx="+ objects.length);
          else
              this.objects[pointer++]=object;
    }

    @Override
    public T pop() {

        return null;
    }

    @Override
    public T peak() {
        return null;
    }
}
