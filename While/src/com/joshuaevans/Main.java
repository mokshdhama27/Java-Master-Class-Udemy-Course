package com.joshuaevans;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("While");
        int count = 1;
        while (count != 6) {
            System.out.println("The count value is " + count);
            count++;
        }
        /*
         * The while loop is similar to the for statement.
         * The while loop is a better fit when we are not sure how many times we want to loop.
         * */
        // Same outcome but with a for loop
        System.out.println("For Loop");
        for (count = 1; count != 6; count++) {
            System.out.println("The count value is " + count);
        }
        // Another while example
        System.out.println("Infinite While");
        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("The count value is " + count);
            count++;
        }
        // Do While example
        System.out.println("Do While");
        count = 1;
        do {
            System.out.println("The count value is " + count);
            count++;
            if (count > 100) {
                break;
            }
        } while (count < 6);
        // The do statement is guaranteed to execute at least once

        // Challenge
        System.out.println("Challenge");
        int number = 4;
        int finishNumber = 20;
        while (number <= finishNumber) {
            number++; // It is a good practice to start with the increment statement to prevent inifinite loops due to forgetting
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
        }

        // Second Challenge
        System.out.println("Second Challenge");
        number = 0;
        finishNumber = 50;
        count = 0;
        System.out.println("Even numbers between " + number + " and " + finishNumber + " up to five numbers.");

        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            count ++;
            if(count >=5){
                break;
            }
        }
        System.out.println("Total number of even numbers found = " + count);
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
