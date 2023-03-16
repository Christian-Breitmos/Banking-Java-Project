package com.company;

import java.time.LocalDate;

public class Savings extends Account{
    private LocalDate date;
    public Savings(int account_number, double balance, LocalDate date) {
        super(account_number, balance);
        this.date = date;

    }

    @Override
    public double withdraw(double amount) {

        return getBalance();
    }
}
