package com.joshuaevans;

public class VIPCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VIPCustomer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    public VIPCustomer(){
        this("Default name", 0001, "default email address");
        System.out.println("Constructor called with default values");
    }
    public VIPCustomer(String name, String emailAddress){
        this(name, 0001, emailAddress);
        System.out.println("Constructor called with default credit limit");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
