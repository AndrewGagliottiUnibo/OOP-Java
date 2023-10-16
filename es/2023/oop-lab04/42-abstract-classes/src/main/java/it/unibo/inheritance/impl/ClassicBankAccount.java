package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AbstractBankAccount;
import it.unibo.inheritance.api.AccountHolder;

public class ClassicBankAccount extends AbstractBankAccount {

    // Constructor
    public ClassicBankAccount(AccountHolder accountHolder, double balance) {
        super(accountHolder, balance);
        //TODO Auto-generated constructor stub
    }

    @Override
    protected boolean isWithDrawAllowed(double value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isWithDrawAllowed'");
    }

    @Override
    protected double computeFee() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'computeFee'");
    }
    
}
