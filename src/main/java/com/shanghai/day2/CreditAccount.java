package com.shanghai.day2;

import java.net.ConnectException;

public class CreditAccount extends Account {

    protected IAssessmentService service = null;

    public CreditAccount(){
        this.service = new IAssessmentService.AssessmentService();
    }

    public void setService(IAssessmentService service) {
        this.service = service;
    }

    private String socialSecurityNumber;

    public CreditAccount(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public boolean isInsufficientFunds(long amount)throws ConnectException{
        return getBalance() + service.getCredit(socialSecurityNumber) < amount;
    }


}
