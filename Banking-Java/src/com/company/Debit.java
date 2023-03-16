package com.company;

public class Debit extends Account {
    private double fee;
    public Debit(int account_number, double balance, double fee) {
        super(account_number, balance);
        this.fee =  fee;
    }
    @Override
    public double withdraw(double amount) {
        if(amount + fee > getBalance()){
            System.out.println("You don't have sufficient funds.");
        }else{
            balance -= (amount + fee);
        }
        return balance;
    }


}
