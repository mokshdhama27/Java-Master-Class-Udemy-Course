package com.joshuaevans;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("the sum of the digits in number 125 is " + sumDigits(125));
        System.out.println("the sum of the digits in number -125 is " + sumDigits(-125));
        System.out.println("the sum of the digits in number 4 is " + sumDigits(4));
        System.out.println("the sum of the digits in number 32123 is " + sumDigits(32123));

    }

    private static int sumDigits(int number){

        if (number < 10) {
            return -1;
        }

        int sum = 0;
        // 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5;
        // int discards decimal places
        while (number > 0) {
            // extract the least significant digit
            int digit = number % 10;
            // add to sum
            sum += digit;
            // drop the least significant digit
            number /= 10; // same as number = number / 10;
        }
        return sum;
    }
}
