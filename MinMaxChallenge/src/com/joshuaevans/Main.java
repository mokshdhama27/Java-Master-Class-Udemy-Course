package com.joshuaevans;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        int endless = 0;
        while(endless == 0){
            System.out.println("To exit the program, enter a non-integer");
            System.out.println("Enter a number: ");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int input = scanner.nextInt();
                scanner.nextLine();
                if(min == 0){
                    min = input;
                } else {
                    if(input > max){
                        max = input;
                    }
                    if(input < min){
                        min = input;
                    }
                }
                System.out.println("Max: " + max);
                System.out.println("Min: " + min);
            } else {
                System.out.println("Exiting Min-Max");
                break;
            }
        }
    }
}
