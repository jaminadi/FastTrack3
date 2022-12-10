package com.day02;

public class StringClass {

    public static void main(String[] args) {

        int a = 10; // this will be stored in Stack
        String str = "hello"; //this is String object, so str will be stored in Stack, but "hello" will be stored in Heap

        System.out.println(str.hashCode());

        str = "hola"; // the value of str will change from 'hello' to 'hola'
        System.out.println(str.hashCode());

        //When we create an object, we use "new" keyword, but this rule does not apply to String.
        //Using "new" keyword creates a different object in the memory
        //If we are creating 2 objects with the same value without using "new" keyword,
        //it will be stored in the same place in memory
        String str2 = "world";
        String str3 = "world";

        String str4 = new String("world"); //this will create a completely different object
    }
}
