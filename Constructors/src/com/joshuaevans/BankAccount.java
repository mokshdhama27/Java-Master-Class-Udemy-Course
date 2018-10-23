package com.joshuaevans;

public class BankAccount {

    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

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
