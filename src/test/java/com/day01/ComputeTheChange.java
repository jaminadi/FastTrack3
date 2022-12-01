package com.day01;

public class ComputeTheChange {

    public static void main(String[] args) {
        /**
         * Compute the change/63
         *
         * Enter an amount, for example: 11.56
         * Your amount of 11.56 consists of:
         * 11 dollars
         * 2 quarters = 25 cents
         * 0 dimes = 10 cents
         * 1 nickels = 5 cents
         * 1 pennies = 1 cent
         */

        double num = 11.56; // If I multiply 11.56 by 100, I will get 1156

        int numbersInCents = (int) (11.56 * 100); // returns 1156

        int dollars = numbersInCents / 100; //gives me the dollar amount ==> returns 11
        numbersInCents = numbersInCents % 100; // this will return the last two digits of the numbersInCents value

        int quarters = numbersInCents / 25; // gives us the quarter amount ==> returns 2
        numbersInCents %= 25; //returns the amount less than 25 cents ==> returns 6

        int dimes = numbersInCents / 10; // gives me the dime amount ==> returns 0
        numbersInCents %= 10; // returns the amount less than 10 cents ==> returns 6

        int nickels = numbersInCents / 5; // gives me the nickels amount ==> returns 1

        int pennies = numbersInCents % 5; //gives me the penny amount

        System.out.println("Dollar amount: " + dollars + "\nQuarter amount: " + quarters +
                "\nDime amount: " + dimes + "\nNickel amount: " + nickels + "\nPenny amount: " + pennies);
    }
}
