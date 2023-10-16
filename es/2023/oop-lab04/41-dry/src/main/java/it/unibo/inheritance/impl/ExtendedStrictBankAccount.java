package it.unibo.inheritance.impl;

public class ExtendedStrictBankAccount extends SimpleBankAccount{

    private static final double TRANSACTION_FEE = 0.1;

    // Constructor
    public ExtendedStrictBankAccount(int id, double balance) {
        super(id, balance);
    }
    
    // Methods
    private void transactionOp(final int id, final double amount) {
        if (this.checkUser(id)) {
            this.setBalance(this.getBalance() + amount);
            this.incrementTransactions();
        }
    }

    public void deposit(final int id, final double amount) {
        this.transactionOp(id, amount);
    }

    public void withdraw(final int id, final double amount) {
        if (this.isWithdrawAllowed(amount)) {
            this.transactionOp(id, -amount);
        }
    }

    public void depositFromATM(final int id, final double amount) {
        this.deposit(id, amount - ATM_TRANSACTION_FEE);
    }

    public void withdrawFromATM(final int id, final double amount) {
        this.withdraw(id, amount + ATM_TRANSACTION_FEE);
    }

    public void chargeManagementFees(final int id) {
        final double feeAmount = MANAGEMENT_FEE + this.getTransactionsCount() * TRANSACTION_FEE;
        if (this.checkUser(id) && this.isWithdrawAllowed(feeAmount)) {
            this.setBalance(this.getBalance() - feeAmount);
            this.resetTransactions();
        }
    }

    private boolean isWithdrawAllowed(final double amount) {
        return this.getBalance() >= amount;
    }
}
