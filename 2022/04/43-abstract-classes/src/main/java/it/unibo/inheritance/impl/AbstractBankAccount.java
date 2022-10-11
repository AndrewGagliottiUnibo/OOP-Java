package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AccountHolder;
import it.unibo.inheritance.api.BankAccount;

public abstract class AbstractBankAccount implements BankAccount {

    protected static final double ATM_TRANSACTION_FEE = 1;
    protected static final double MANAGEMENT_FEE = 5;

    private AccountHolder holder;
    private double balance;
    private int transactions;

    /**
     * Constructor.
     * @param holder
     * @param balance
     */
    protected AbstractBankAccount(final AccountHolder holder, final double balance) { 
        this.holder = holder;
        this.balance = balance;
        this.transactions = 0;
    }

    @Override
    public final void chargeManagementFees(final int id) {
        final double feeAmount = computeFee();
        if (checkUser(id) && this.isWithDrawAllowed(feeAmount)) {
            this.balance -= feeAmount;
            this.resetTransactions();
        }
    }

    @Override
    public final void deposit(final int id, final double amount) {
        this.transactionOp(id, amount);
    }

    @Override
    public final void depositFromATM(final int id, final double amount) {
        this.deposit(id, amount - ATM_TRANSACTION_FEE);
    }

    @Override
    public final AccountHolder getAccountHolder() {
        return this.holder;
    }

    @Override
    public final double getBalance() {
        return this.balance;
    }

    @Override
    public final int getTransactionsCount() {
        return this.transactions;
    }

    @Override
    public final void withdraw(final int id, final double amount) {
        if (this.isWithDrawAllowed(amount)) {
            this.transactionOp(id, -amount);
        }
    }

    @Override
    public final void withdrawFromATM(final int id, final double amount) {
        this.withdraw(id, amount + ATM_TRANSACTION_FEE);
    }

    /*
     * Helper methods.
     */
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
