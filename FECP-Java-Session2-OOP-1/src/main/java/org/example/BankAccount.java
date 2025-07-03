package org.example;

import java.util.*;

public class BankAccount {

    Scanner s = new Scanner(System.in);

    private final int accountNumber;
    private final String holderName;
    private double availableBalance;

    public BankAccount(int accountNumber, String holderName, double availableBalance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.availableBalance = availableBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) availableBalance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= availableBalance) availableBalance -= amount;
    }


    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder: " + holderName);
        System.out.println("Balance: $" + availableBalance);
    }
}
