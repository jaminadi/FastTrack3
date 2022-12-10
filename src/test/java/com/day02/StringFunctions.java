package com.day02;

public class StringFunctions {
    public static void main(String[] args) {
        // charAt(), replace(), substring(), ***split()***
        // toUpperCase(), toLowerCase(), etc...

        String str = "plusminusplusminusplusminus";

        char ch = str.charAt(0); //returns p
        System.out.println(ch);

        //replace plus with "+", and minus with "-"
        String str2 = str.replace("plus", "+");
        str2 = str2.replace("minus", "-");
        System.out.println(str2); //returns +-+-+-

        //Given a time, return only hours
        // Ex: 11:00, 9:00, 15:00
        //return: the time is 11, or the time is 9
        //if it does not find index of the given char, it will return -1

        //String str3 = "11:00";
        //how to get rid of white spaces in between, use trim method
        String str3 = "   11:00   ";
        str3 = str3.trim();
        int indexOfChar = str3.indexOf(":");
        String str4 = str3.substring(0, indexOfChar);
        System.out.println("The hour is: " + str4); //returns 11

        //Given a name, return only last name
        // John Snow, Arya Stark
        String fullName = "John Snow";
        int index = fullName.indexOf(" ");
        String lastName = fullName.substring(index + 1, fullName.length()); // plus 1 because otherwise it will return " Snow" including space
        System.out.println(lastName);

        String str5 = "plusminusPlusMinus";
        System.out.println(str5.toUpperCase());
        System.out.println(str5.toLowerCase());

        //split method
        String str6 = "This is a string"; // [This, is, a, string]
        String[] strArray = str6.split(" ");

        //join(); whatever you put in delimeter, it will appear in between each word in a sentence
        System.out.println(String.join(" ", "This", "is", "a", "string"));

        //sort a string and make the first word upper case
        // This is a string ==> A is string this


    }
}
