package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AccountHolder;
import it.unibo.inheritance.api.BankAccount;

public abstract class AbstractBankAccount implements BankAccount {

    protected static final double ATM_TRANSACTION_FEE = 1;

    private AccountHolder holder;
    private double balance;
    private int transactions;

    protected AbstractBankAccount(final AccountHolder holder, final double balance) { 
        this.holder = holder;
    }

    @Override
    public void chargeManagementFees(final int id) {
        if (this.checkUser(id)) {
            this.resetTransactions();
        }
    }

    @Override
    public void deposit(final int id, final double amount) {
        this.transactionOp(id, amount);
    }

    @Override
    public void depositFromATM(final int id, final double amount) {
        this.deposit(id, amount - ATM_TRANSACTION_FEE);
    }

    @Override
    public AccountHolder getAccountHolder() {
        return this.holder;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public int getTransactionsCount() {
        return this.transactions;
    }

    @Override
    public void withdraw(final int id, final double amount) {
        this.transactionOp(id, -amount);
    }

    @Override
    public void withdrawFromATM(final int id, final double amount) {
        this.withdraw(id, amount + ATM_TRANSACTION_FEE);
    }

    /*
     * Helper methods.
     */
    public void setBalance(final double newBalance) {
        this.balance = newBalance;
    }

    private void resetTransactions() {
        this.transactions = 0;
    }

    private void incrementTransactions() {
        this.transactions++;
    }

    private boolean checkUser(final int id) {
        return this.getAccountHolder().getUserID() == id;
    }

    private void transactionOp(final int id, final double amount) {
        if (this.checkUser(id)) {
            this.balance += amount;
            this.incrementTransactions();
        }
    }

    /*
     * Abstract methods here.
     */
    protected abstract boolean isWithDrawAllowed(final double amount);

    protected abstract double computeFee();
    
}
