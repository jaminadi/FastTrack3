package com.day02;

public class PrimeNumbers {

    public static void main(String[] args) {

        //find the prime numbers till 100
        // can only be divisible by itself and 1
        //the numbers can start from 2, 3, 5, 7, 11, 13, 17, etc.

        int limit = 100;

        for (int prime = 2; prime < limit; prime++) {
            Boolean isPrime = true;
            for (int divisor = 2; divisor < prime; divisor++) {
                if (prime % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(prime + " ");
            }
        }


    }
}
