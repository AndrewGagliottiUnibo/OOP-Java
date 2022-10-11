package it.unibo.inheritance.impl;

public class ExtendedStrictBankAccount extends SimpleBankAccount {

    private static final double TRANSACTION_FEE = 0.1;

    public ExtendedStrictBankAccount(final int id, final double balance) {
        super(id, balance);
    }

    // super call for deposit
    public void deposit(final int id, final double amount) {
        super.deposit(id, amount);
    }

    // super call for withdraw checking first the balance amount
    public void withdraw(final int id, final double amount) {
        if (this.isWithdrawAllowed(amount)) {
            super.withdraw(id, -amount);
            ;
        }
    }

    // super call for ATM deposit
    public void depositFromATM(final int id, final double amount) {
        super.deposit(id, amount);
    }

    // super call for ATM withdraw
    public void withdrawFromATM(final int id, final double amount) {
        if (this.isWithdrawAllowed(amount + ATM_TRANSACTION_FEE)) {
            super.withdrawFromATM(id, amount);
        }
    }

    // super call for balance
    public double getBalance() {
        return super.getBalance();
    }

    // super call for numberOfTransactions
    public int getTransactionsCount() {
        return super.getTransactionsCount();
    }

    // Calling this.getTransactions because due to incapsulation I want to hide
    // that SimpleBankAccount exists.
    public void chargeManagementFees(final int id) {
        final double feeAmount = MANAGEMENT_FEE + this.getTransactionsCount() * TRANSACTION_FEE;
        if (super.checkUser(id) && this.isWithdrawAllowed(feeAmount)) {
            super.withdraw(id, feeAmount);
            super.resetTransactions();
        }
    }

    // super call for balance
    private boolean isWithdrawAllowed(final double amount) {
        return super.getBalance() >= amount;
    }
}
