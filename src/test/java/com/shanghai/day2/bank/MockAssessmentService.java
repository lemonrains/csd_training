package com.shanghai.day2.bank;

import com.shanghai.day2.IAssessmentService;

import java.net.ConnectException;


public class MockAssessmentService implements IAssessmentService {

    public long getCredit(String socialSecurityNumber) throws ConnectException {

        return 100;
    }


}
