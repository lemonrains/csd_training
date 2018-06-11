package com.shanghai.day2.bank;

import com.shanghai.day2.Account;
import com.shanghai.day2.CreditAccount;
import com.shanghai.day2.DebitAccount;
import com.shanghai.day2.InsufficientFundsException;
import org.junit.Before;
import org.junit.Test;

import java.net.ConnectException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AccountTest {

    @Before
    public void init(){
        
    }

    @Test
    public void deposit_debit() throws ConnectException {
        Account debitAccount = new DebitAccount();

        debitAccount.deposit(10);
        assertEquals(10, debitAccount.getBalance());

        debitAccount.deposit(20);
        assertEquals(30, debitAccount.getBalance());

        debitAccount.withdraw(5);
        assertEquals(25, debitAccount.getBalance());

        try {
            debitAccount.withdraw(30);
            fail();
        } catch (InsufficientFundsException e){
            assertEquals(25, debitAccount.getBalance());
        }
    }

    @Test
    public void deposit_credit() throws ConnectException {
        Account creditAccount = new CreditAccount("123");

        ((CreditAccount) creditAccount).setService(new MockAssessmentService());

        creditAccount.deposit(10);
        assertEquals(10, creditAccount.getBalance());

        creditAccount.deposit(20);
        assertEquals(30, creditAccount.getBalance());

        creditAccount.withdraw(5);
        assertEquals(25, creditAccount.getBalance());

        try {
            creditAccount.withdraw(250);
            fail();
        } catch (InsufficientFundsException e){
            assertEquals(25, creditAccount.getBalance());
        }
    }

    @Test
    public void withdraw() {
    }
}