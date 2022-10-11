package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AccountHolder;

public class RestrictedBankAccount extends AbstractBankAccount {

    private static final double MANAGEMENT_FEE = 5;

    public RestrictedBankAccount(final AccountHolder holder,  final double balance) {
        super(holder, balance);
    }

    public void deposit(final int id, final double amount) {
        super.deposit(id, amount);
    }

    public void withdraw(final int id, final double amount) {
        if (this.isWithDrawAllowed(amount)) {
            super.withdraw(id, amount);;
        }
    }

    public void depositFromATM(final int id, final double amount) {
        super.depositFromATM(id, amount);
    }

    public void withdrawFromATM(final int id, final double amount) {
        super.withdrawFromATM(id, amount);
    }

    public double getBalance() {
        return super.getBalance();
    }

    public int getTransactionsCount() {
        return super.getTransactionsCount();
    }

    /*
     * Abstract method implementations here.
     */
    @Override
    protected boolean isWithDrawAllowed(double amount) {
        return super.getBalance() >= amount;
    }

    @Override
    protected double computeFee() {
        return super.getTransactionsCount() * MANAGEMENT_FEE;
    }
}
