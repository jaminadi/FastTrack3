package com.day02;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

    /*
    Palindromic numbers or strings
    Given a string, find out if the string is a Palindrome or not
    mama, madam, 8899889, SAIPPUAKIVIKAUPPIAS
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string or a number to check for Palindrome");

        String str = input.nextLine();

        //999
        int low = 0;
        int high = str.length() - 1;

        Boolean isPalindrome = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(low) != str.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        System.out.println("Is that a Palindrome: " + isPalindrome);
    }
}
