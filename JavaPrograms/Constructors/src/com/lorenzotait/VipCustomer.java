package com.lorenzotait;

/**
 * Created by LorenzoTait on 15/04/17.
 */
public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("Default_name", 1000.00, "default@mail.com");
        System.out.println("Constructor with 0 parameters called");
    }

    public VipCustomer (String name, double creditLimit) {
        this(name, creditLimit, "default@mail.com");
        System.out.println("Constructor with 2 parameters called");
    }


    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("Constructor with 3 parameters called");
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
