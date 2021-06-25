package com.datastructures;

import com.datastructures.stack.Simplestack;
import com.datastructures.stack.Stack;

public class Main {
   public static void main(String[] args) {
       Stack<String> stringStack=new Simplestack<>();
       stringStack.push("1");
       stringStack.push("2");
       System.out.println(stringStack);
       int y=3; String z="";
       for (int i = 2; i <10 ; i++) {
           z=String.valueOf(y);
           stringStack.push(z);  y++;
       }
       Stack<String> s=stringStack;
       System.out.println(s);
       stringStack.pop();
       stringStack.pop();
       System.out.println(s);
       System.out.println(stringStack);


   }
}
