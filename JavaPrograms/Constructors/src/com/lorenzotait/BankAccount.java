package com.lorenzotait;

/**
 * Created by LorenzoTait on 15/04/17.
 */
public class BankAccount {
    // these are 5 fields
    private String accountNumber;
    private double balance;
    private String costumerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("45678", 2.50, "Default name", "default email", "default number");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double balance, String costumerName, String email, String phoneNumber){
        System.out.println("BankAccount constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.costumerName = costumerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public BankAccount(String costumerName, String email, String phoneNumber) {
        this("9999", 100.55, costumerName, email, phoneNumber);
    }

    // Set and Get for accountNumber
    public void setAccountNumber (String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    // Set and Get for balance
    public void setBalance (double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    // Set and Get for costumerName
    public void setCostumerName (String costumerName){
        this.costumerName = costumerName;
    }

    public String getCostumerName(){
        return this.costumerName;
    }

    // Set and Get for email
    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    // Set and Get for phoneNumber
    public void setPhoneNumber (String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    // Method 1: increase balance

    public void addMoney (double additionalMoney){
        this.balance += additionalMoney;
        System.out.println("Money added to your bank balance");
    }

    // Method 2: decrease balance with check

    public void takeMoney (double takingMoney) {
        if ((this.balance - takingMoney) < 0.0) {
            System.out.println("Invalid operation: transaction not completed");
            System.out.println("Not enough money");
        } else {
            this.balance -= takingMoney;
            System.out.println("Transaction completed");
        }
    }
}
