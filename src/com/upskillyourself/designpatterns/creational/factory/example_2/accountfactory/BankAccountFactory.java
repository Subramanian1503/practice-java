package com.upskillyourself.designpatterns.creational.factory.example_2.accountfactory;

import com.upskillyourself.designpatterns.creational.factory.example_2.account.BankAccount;

public interface BankAccountFactory {

    BankAccount getBankAccount(String bankAccountType);
}
