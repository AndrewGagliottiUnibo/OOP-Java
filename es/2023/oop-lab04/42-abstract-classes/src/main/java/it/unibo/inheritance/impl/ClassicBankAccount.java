package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AbstractBankAccount;
import it.unibo.inheritance.api.AccountHolder;

public class ClassicBankAccount extends AbstractBankAccount {

    // Constructor
    public ClassicBankAccount(AccountHolder accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    protected boolean isWithDrawAllowed(double value) {
        return super.getBalance() >= value;
    }

    @Override
    protected double computeFee() {
        return AbstractBankAccount.MANAGEMENT_FEE;
    }  
}
