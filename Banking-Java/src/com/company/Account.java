package com.company;

public abstract class Account {
    private final int account_number;
    protected double balance;

    public int getAccount_number() {
        return account_number;
    }

    public double getBalance() {
        return balance;
    }

    public abstract double withdraw(double balance);



    public Account(int account_number, double balance){
        this.account_number = account_number;
        this.balance = balance;
    }
}
