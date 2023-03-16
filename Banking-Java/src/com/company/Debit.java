package com.company;

public class Debit extends Account {
    private double fee;
    public Debit(int account_number, double balance, double fee) {
        super(account_number, balance);
        this.fee =  fee;
    }
    @Override
    public double withdraw(double amount) {
        return getBalance();
    }


}
