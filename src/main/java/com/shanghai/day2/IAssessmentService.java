package com.shanghai.day2;

import java.net.ConnectException;

public interface IAssessmentService {
    long getCredit(String socialSecurityNumber) throws ConnectException;

    public static class AssessmentService implements IAssessmentService {

        public long getCredit(String socialSecurityNumber) throws ConnectException {
            long value = (long) (Math.random() * 10000L);
            try {
                Thread.sleep(value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (Math.random() > 0.66) {
                throw new ConnectException();
            }
            return value;
        }

    }

}
