package com.joshuaevans;

public class Main {

    public static void main(String[] args) {
	// Pre-constructor
//        BankAccount account = new BankAccount();
//
//        account.setBalance(100.00);
//        account.setAccountNumber(12313242);
//        account.setCustomerName("Joshua Evans");
//        account.setEmail("josh@example.com");
//        account.setPhoneNumber("+1(234)-234-2343");
//
//        System.out.println(account.depositFunds(25.34));
//        System.out.println(account.withdrawFunds(36.45));

        BankAccount gregsAccount = new BankAccount(12313242, 100.00,
                "Joshua","josh@example.com",
                "+1(756)-756-9876");
        System.out.println(gregsAccount.depositFunds(23.54));
        System.out.println(gregsAccount.withdrawFunds(98.67));

        VIPCustomer customerOne = new VIPCustomer();
        System.out.println(customerOne.getName());

        VIPCustomer customerTwo = new VIPCustomer("Bob", "bob@email.com");
        System.out.println(customerTwo.getName());
    }
}
