package com.datastructures.stack;

public class NodaStack<T> implements Stack<T> {
    private int size;
    private Noder<T> head;

    public static void main(String[] args) {
        NodaStack<String> test=new NodaStack<>();
        test.push("flat");
        test.push("kvartira");
        test.push("house");

        System.out.println(test.peak());
        test.pop();
        System.out.println(test.peak());
    }



    @Override
    public void push(T object) {
        if (head == null) {
            head = new Noder<T>(object);
            return;
        }
        Noder<T> current = head;
        while (current.getNext() != null){ //Добегает ли счетчик до значения ноль т.е. current.getNext() = null
            //и после значит это значение передается в куррент(куррент равен ноль)
            current = current.getNext();
        }
        current.setNext(new Noder<T>( object)); // здесь тогла нолевому курренту передается новый объект

    }

    @Override
    public T pop() {
        if (head == null) {
            return null;
        }

        if (head.getNext() == null) {
            T v = head.getObject();
            head = null;
            return v;
        }

        Noder<T> current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        T result = current.getNext().getObject();// двойные или тройные методы только со сслыками?

      current.setNext(null);
        return result;
    }

    @Override
    public T peak() {
        if (head == null) {
            return null;
        }

        Noder<T> current = head;
        while (current.getNext() != null){
            current = current.getNext();
        }
       return current.getObject();
        }
}
