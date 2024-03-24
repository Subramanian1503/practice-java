package com.upskillyourself.designpatterns.creational.factory.example_2.account;

public class SavingsAccount implements BankAccount {
    @Override
    public void validateUserIdentity() {

    }

    @Override
    public long calculateInterest() {
        return 0;
    }

    @Override
    public boolean createAccount() {
        return false;
    }
}
