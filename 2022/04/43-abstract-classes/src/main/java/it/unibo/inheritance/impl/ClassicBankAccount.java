package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AccountHolder;

public class ClassicBankAccount extends AbstractBankAccount {
    
    private static final double MANAGEMENT_FEE = 5;

    /**
     * Constructor.
     * @param holder
     * @param balance
     */
    public ClassicBankAccount(final AccountHolder holder, final double balance) {
        super(holder, balance);
    }

    /*
     * Abstract methods implementations.
     */
    @Override
    protected boolean isWithDrawAllowed(double amount) {
        return true;
    }

    @Override
    protected double computeFee() {
        return MANAGEMENT_FEE;
    }
}
