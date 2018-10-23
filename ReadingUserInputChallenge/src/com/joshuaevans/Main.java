package com.joshuaevans;
import java.util.Scanner;
/*
* Challenge:
*
* Read 10 numbers from the console and print the sum of those numbers
*/

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        int repetitions = 0;
        int sum = 0;
        while(repetitions < 10){
            repetitions++;
            System.out.println("Enter 10 numbers to sum: Number " + repetitions + " = ");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int input = scanner.nextInt();
                scanner.nextLine();
                sum += input;
            } else {
                System.out.println("ERROR: Input must be of type integer");
                break;
            }
        }
        if(repetitions < 10){
            System.out.println("ERROR: All inputs must be of type integer");
        } else {
            System.out.println("The sum of those ten numbers is " + sum);
        }
    }
}
