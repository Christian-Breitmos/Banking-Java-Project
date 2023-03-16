package com.company;

import java.time.LocalDate;
import java.util.Date;

public class Savings extends Account{
    private Date date;
    public Savings(int account_number, double balance, Date date) {
        super(account_number, balance);
        this.date = date;

    }

    @Override
    public double withdraw(double amount) {
       Date today = new Date();
       double diff = today.getTime() - date.getTime();
       double daysPassed = diff / (24 * 60 * 60 * 1000);
       if(daysPassed < 730){
           System.out.println("You can't withdraw money before 2 years have passed.");
       }else{
           balance -= amount;
       }
        return balance;
    }
}
