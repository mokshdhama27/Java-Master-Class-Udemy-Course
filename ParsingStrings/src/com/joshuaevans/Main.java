package com.joshuaevans;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String numberAsString = "2018";
        System.out.println("numberAsString: " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        String doubleNumberAsString = "2000.10";
        System.out.println("doubleNumberAsString = " + doubleNumberAsString);

        double doubleNumber = Double.parseDouble(doubleNumberAsString);
        System.out.println("doubleNumber = " + doubleNumber);

        doubleNumberAsString += 1;
        doubleNumber += 1;
        System.out.println("doubleNumberAsString = " + doubleNumberAsString);
        System.out.println("doubleNumber = " + doubleNumber);
    }
}
