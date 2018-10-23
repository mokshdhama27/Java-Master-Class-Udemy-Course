package com.joshuaevans;

public class BankAccount {

    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // Constructor
    public BankAccount(){
        /* In the case that an empty constructor is called, we can call one of our other
         * overloaded constructor methods within the constructor and pass some
         * default values in using the keyword this();  This must be the first statement
         * in the constructor body
         */
        this(0000001, 0.00, "Default name",
                "default address", "default number");
        System.out.println("Constructor called with all default fields");
    }
    public BankAccount(long accountNumber, double balance, String customerName,
                       String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        /*
         * General rule of thumb is to not call any other methods besides a constructor within
         * a constructor
         */
    }
    public BankAccount(String customerName, String email, String phoneNumber){
        this(0000001, 00.00, customerName, email, phoneNumber);
        System.out.println("Constructor called with default number and balance");
    }

    // accountNumber getter and setter
    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }
    public long getAccountNumber(){
        return this.accountNumber;
    }
    // balance getter and setter
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    // customerName getter and setter
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    // email getter and setter
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    // phoneNumber getter and setter
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public String depositFunds(double deposit){
        this.balance += deposit;
        return "New balance is " + this.balance;
    }

    public String withdrawFunds(double withdrawal){
        if(this.balance - withdrawal > 0){
            this.balance -= withdrawal;
            return "New balance is " + this.balance;
        } else {
            return "Insufficient funds";
        }
    }
}
