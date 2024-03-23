package com.upskillyourself.designpatterns.creational.factory.example_2;

import com.upskillyourself.designpatterns.creational.factory.example_2.account.BankAccount;
import com.upskillyourself.designpatterns.creational.factory.example_2.accountfactory.BankAccountFactory;
import com.upskillyourself.designpatterns.creational.factory.example_2.accountfactory.LocalBankAccountFactory;
import com.upskillyourself.designpatterns.creational.factory.example_2.accountfactory.OnsiteBankAccountFactory;

import java.util.Locale;

public class Application {

    public static void main(String args[]) {
        String bankAccountType = "Savings";
        String bankAccountSite = "Local";
        BankAccountFactory bankAccountFactory = getBankAccountFactory(bankAccountSite);
        BankAccount bankAccount = bankAccountFactory.getBankAccount(bankAccountType);
        bankAccount.validateUserIdentity();
        bankAccount.createAccount();
        bankAccount.calculateInterest();
    }

    private static BankAccountFactory getBankAccountFactory(String bankAccount) {
        return bankAccount.toUpperCase(Locale.ROOT).equals("LOCAL") ? new LocalBankAccountFactory() : new OnsiteBankAccountFactory();
    }
}
