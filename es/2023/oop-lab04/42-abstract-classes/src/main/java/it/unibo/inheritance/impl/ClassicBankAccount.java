package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AbstractBankAccount;
import it.unibo.inheritance.api.AccountHolder;

public class ClassicBankAccount extends AbstractBankAccount {

    // Constructor
    public ClassicBankAccount(final AccountHolder accountHolder, final double balance) {
        super(accountHolder, balance);
    }

    @Override
    protected boolean isWithDrawAllowed(final double value) {
                return true;
    }

    @Override
    protected double computeFee() {
        return AbstractBankAccount.MANAGEMENT_FEE;
    }  
}
