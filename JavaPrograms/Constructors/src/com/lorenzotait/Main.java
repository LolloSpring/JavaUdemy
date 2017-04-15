package com.lorenzotait;

public class Main {

    public static void main(String[] args) {
        BankAccount lorenzo = new BankAccount("1234", 0.00, "Bob Brown", "myemail@bob.com", "0461931795");

        // Test for accountNumber
        lorenzo.setAccountNumber("ABCDE");
        String accountNumber = lorenzo.getAccountNumber();
        System.out.println("Account number of Lorenzo is " + accountNumber);

        // Test for balance
        lorenzo.setBalance(10000);
        double balance = lorenzo.getBalance();
        System.out.println("Balance of Lorenzo is " + balance);

        // Test for costumerName
        lorenzo.setCostumerName("Lorenzo Tait");
        String costumerName = lorenzo.getCostumerName();
        System.out.println("The costumer name is " + costumerName);

        // Test for email
        lorenzo.setEmail("lorenzo.tait95@gmail.com");
        String email = lorenzo.getEmail();
        System.out.println("Email di lorenzo e' "+ email);

        // Test for phoneNumber
        lorenzo.setPhoneNumber("3313863453");
        String phoneNumber = lorenzo.getPhoneNumber();
        System.out.println("The phone number is " + phoneNumber);

        // Test for Method 1

        lorenzo.addMoney(2000);
        System.out.println("New balance is " + lorenzo.getBalance());


        // Tests for Method 2
        lorenzo.takeMoney(500);
        System.out.println("New balance is " + lorenzo.getBalance());

        lorenzo.takeMoney(20000);
        System.out.println("Balance is " + lorenzo.getBalance());

        VipCustomer zeroCalovi = new VipCustomer();
        VipCustomer twoCalovi = new VipCustomer("Lorenzo", 7000.00);
        VipCustomer threeCalovi = new VipCustomer("Lorenzo", 5000.00, "lorenzo.calovi@hotmail.it");

    }
}
