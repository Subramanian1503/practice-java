package com.upskillyourself.designpatterns.creational.factory.example_2.accountfactory;

import com.upskillyourself.designpatterns.creational.factory.example_2.account.BankAccount;

public class OnsiteBankAccountFactory implements BankAccountFactory {
    @Override
    public BankAccount getBankAccount(String bankAccountType) {
        return null;
    }
}
