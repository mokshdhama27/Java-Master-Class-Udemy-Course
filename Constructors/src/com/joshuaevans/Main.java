package com.joshuaevans;

public class Main {

    public static void main(String[] args) {
	// Pre-constructor
        BankAccount account = new BankAccount();

        account.setBalance(100.00);
        account.setAccountNumber(12313242);
        account.setCustomerName("Joshua Evans");
        account.setEmail("josh@example.com");
        account.setPhoneNumber("+1(234)-234-2343");

        System.out.println(account.depositFunds(25.34));
        System.out.println(account.withdrawFunds(36.45));
    }
}
