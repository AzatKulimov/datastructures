package com.datastructures.stack;

import java.util.Arrays;

public class VStack {
    private int size;
    private int [] arr;
    private int top;

    public VStack(int a){
        size=a;
        arr=new int[size];
        top=-1;
    }

    public boolean isEmpty(){
        return (top==-1);
    }

    public void push(int b){

        arr[++top]= b;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("EMPTY"); return 0;
        }
        else return arr[top--];
    }

    @Override
    public String toString() {
        return "VStack{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public static void main(String[] args) {
        VStack vStack=new VStack(4);
        vStack.push(3);
        vStack.push(5);
        vStack.push(7);
        vStack.push(9);

        System.out.println(vStack.toString());

        vStack.pop();
        System.out.println(vStack.toString());
        vStack.pop();
        System.out.println(vStack.toString());
        vStack.pop();
        vStack.pop();
        vStack.isEmpty();
        vStack.pop();
        vStack.isEmpty();
    }
}
