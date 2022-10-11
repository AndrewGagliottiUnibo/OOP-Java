package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AccountHolder;

public class ClassicBankAccount extends AbstractBankAccount {

    /**
     * Constructor.
     * @param holder
     * @param balance
     */
    public ClassicBankAccount(final AccountHolder holder, final double balance) {
        super(holder, balance);
    }

    public void chargeManagementFees(final int id) {
        super.chargeManagementFees(id);
    }

    public void deposit(final int id, final double amount) {
        super.deposit(id, amount);
    }

    public void depositFromATM(final int id, final double amount) {
        super.depositFromATM(id, amount);
    }

    public AccountHolder getAccountHolder() {
        return super.getAccountHolder();
    }

    public double getBalance() {
        return super.getBalance();
    }

    public void setBalance(final double balance) {
        super.setBalance(balance);
    }

    public int getTransactionsCount() {
        return super.getTransactionsCount();
    }

    public void withdraw(final int id, final double amount) {
        super.withdraw(id, amount);
    }

    public void withdrawFromATM(final int id, final double amount) {
        super.withdrawFromATM(id, amount);
    }

    /*
     * Abstract methods implementations.
     */
    @Override
    protected boolean isWithDrawAllowed(double amount) {
        return super.getBalance() >= amount;
    }

    @Override
    protected double computeFee() {
        return 0.0;
    }
}
