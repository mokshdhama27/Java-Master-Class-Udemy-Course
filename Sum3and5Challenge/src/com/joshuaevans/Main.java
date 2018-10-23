package com.joshuaevans;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Sum of 3 and 5 Challenge");
        sum3And5(1, 200);
        int answer = 15 + 30 + 45 + 60 + 75;
        System.out.println("Answer: " + answer);
        System.out.println("**************");
        System.out.println("Fizz Buzz Challenge");
        fizzBuzz(1, 100);
        System.out.println("**************");
    }

    public static void sum3And5(int start, int end){

        int count = 0;

        int numbers[] = new int[5];

        for(int i = start; i <= end; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("Divisible by 3 and 5: " + i);
                numbers[count] = i;
                count++;
            }
            if(count >= 5){
                break;
            }
        }

        int sum = 0;

        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        System.out.println("Sum: " + sum);

    }

    public static void fizzBuzz(int start, int end){
        if(start == 0){
            System.out.println("Invalid start value, must be greater than 0.");
        } else {
            for (int i = start; i < end; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}
