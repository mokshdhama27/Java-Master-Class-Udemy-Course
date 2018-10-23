package com.joshuaevans;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            // Following calling nextInt, you need to call nextLine again
            scanner.nextLine(); // Handles the nextLine character (enter key) following the nextInt.  This is a need.
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2018 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("ERROR: Invalid year of birth");
            }
        } else {
            System.out.println("ERROR: Unable to parse year of birth.");
        }

        scanner.close();
    }
}
