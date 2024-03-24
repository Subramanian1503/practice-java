package com.upskillyourself.designpatterns.creational.factory.example_2.accountfactory;

import com.upskillyourself.designpatterns.creational.factory.example_2.account.BankAccount;
import com.upskillyourself.designpatterns.creational.factory.example_2.account.BusinessAccount;
import com.upskillyourself.designpatterns.creational.factory.example_2.account.CurrentAccount;
import com.upskillyourself.designpatterns.creational.factory.example_2.account.SavingsAccount;

import java.util.Locale;

public class LocalBankAccountFactory implements BankAccountFactory {

    public BankAccount getBankAccount(String bankAccountType) {
        switch (bankAccountType.toUpperCase(Locale.ROOT)) {
            case "SAVINGS":
                return new SavingsAccount();
            case "CURRENT":
                return new CurrentAccount();
            case "BUSINESS":
                return new BusinessAccount();
            default:
                throw new RuntimeException("No bank type found");
        }
    }
}
