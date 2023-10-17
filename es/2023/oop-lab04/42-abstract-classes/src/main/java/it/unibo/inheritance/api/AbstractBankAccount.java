package it.unibo.inheritance.api;

public abstract class AbstractBankAccount implements BankAccount {

    protected static final double ATM_TRANSACTION_FEE = 1;
    protected static final double MANAGEMENT_FEE = 5;

    private final AccountHolder holder;
    private double balance;
    private int transactions;

    // Constructor
    public AbstractBankAccount(final AccountHolder accountHolder, final double balance) {
        this.holder = accountHolder;
        this.balance = balance;
        this.transactions = 0;
    }

    @Override
    public void chargeManagementFees(final int id) {
        var fees = this.computeFee();
        if (this.checkUser(id) && this.isWithDrawAllowed(fees)) {
            this.balance -= fees;
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
        if (this.checkUser(id) && this.isWithDrawAllowed(amount)) {
            this.transactionOp(id, -amount);
        }
    }

    @Override
    public void withdrawFromATM(final int id, final double amount) {
        this.withdraw(id, amount + ATM_TRANSACTION_FEE);
    } 

    // Private methods used for checking and updating the balance
    private boolean checkUser(final int id) {
        return this.getAccountHolder().getUserID() == id;
    }

    private void incrementTransactions() {
        this.transactions++;
    }

    private void resetTransactions() {
        this.transactions = 0;
    }

    private void transactionOp(final int id, final double amount) {
        if (this.checkUser(id)) {
            this.balance += amount;
            this.incrementTransactions();
        }
    }

    // New methods
    protected abstract boolean isWithDrawAllowed(final double value);

    protected abstract double computeFee();
}
