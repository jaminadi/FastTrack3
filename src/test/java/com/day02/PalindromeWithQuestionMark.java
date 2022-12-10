package com.day02;

import java.util.Scanner;

public class PalindromeWithQuestionMark {

    /**
     * Write a function solution that, given a string STR of length N, returns any palindrome
     * which can be obtained by replacing all of the question marks in STR
     * by lowercase letters ('a' - 'z'). If no palindrome can be obtained, the function should return the string "no".
     * SA?PPU?KIVIKAUPPI?S
     * b??aba??a
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string or a number to check for Palindrome");

        String str = input.nextLine();

        int low = 0;
        int high = str.length() - 1;

        Boolean isPalindrome = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(low) != '?' && str.charAt(high) != '?') {
                if (str.charAt(low) != str.charAt(high)) {
                    isPalindrome = false;
                    break;
                }
            }
            low++;
            high--;
        }
        System.out.println("Is that a Palindrome: " + isPalindrome);
    }

}

