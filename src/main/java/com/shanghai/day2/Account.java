package com.shanghai.day2;

import java.net.ConnectException;

public abstract class Account {

    private long balance;

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void deposit(long amount) {
        balance += amount;
    }

    public abstract boolean isInsufficientFunds(long amount) throws ConnectException;

    public void withdraw(long amount) throws ConnectException {
        if (isInsufficientFunds(amount)) {
            throw new InsufficientFundsException();
        }
        setBalance(getBalance() - amount);
    }
}
