package com.datastructures.List;

public class LinkLister<T> {
   T name;

    public LinkLister(T n) {
    }

    @Override
    public java.lang.String toString() {
        return "LinkLister{" +
                "name=" + name +
                '}';
    }


    public void adder(T n){
        LinkLister<T>fr=new LinkLister<>(n);
    }

    public static void main(String[] args) {
        LinkLister linkLister=new LinkLister("123");
        LinkLister linkLister1=new LinkLister("900");
      //  linkLister1.adder("Laura");
        linkLister1.adder("Laurel");
        System.out.println(linkLister);
        System.out.println(linkLister1);
    }

}













