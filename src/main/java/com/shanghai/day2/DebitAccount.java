package com.shanghai.day2;

import java.net.ConnectException;

public class DebitAccount extends Account {

    @Override
    public boolean isInsufficientFunds(long amount) throws ConnectException {
        return  getBalance() < amount;
    }


}
