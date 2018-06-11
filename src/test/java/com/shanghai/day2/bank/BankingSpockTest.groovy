package com.shanghai.day2.bank

import com.shanghai.day2.DebitAccount

class BankingSpockTest extends spock.lang.Specification {


    def "借记卡开户"() {
        given: ""

        when: "open a debit account"
            def account = new DebitAccount();

        then: "balance is 0"
            account.getBalance() == 0
    }
}