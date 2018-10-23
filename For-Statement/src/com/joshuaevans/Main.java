package com.joshuaevans;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i = 2; i < 9; i++){
            System.out.println("$10,000 at " + i + "% interest rate = " + String.format("%.2f", calculateInterest(10000.0, (double) i)));
        }
        System.out.println("******************");
        for(int i = 8; i >= 2; i--){
            System.out.println("$10,000 at " + i + "% interest rate = " + String.format("%.2f", calculateInterest(10000.0, (double) i)));
        }
        System.out.println("******************");
        findPrimeNumbersWithinAGivenRange(5, 50);
    }

    public static void findPrimeNumbersWithinAGivenRange(int start, int end){
        int primeNumbersFound = 0;

        for(int i = start; i <= end; i++){
            if(isPrime(i)){
                System.out.println(i);
                primeNumbersFound++;
            }
            if(primeNumbersFound >= 3){
                break;
            }
        }
    }

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }

        for(int i = 2; i <= (long) Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }


}
