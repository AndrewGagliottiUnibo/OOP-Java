package it.unibo.encapsulation.interfaces;

public class StrictBankAccount implements BankAccount {

    private static final double ATM_TRANSACTION_FEE = 1;
    private static final double MANAGEMENT_FEE = 5;

    private final int id;
    private double balance;
    private int transactions;

    public StrictBankAccount(final int id) {
        this.id = id;
        this.balance = 0;
        this.transactions = 0;
    }

    @Override
    public void withdraw(int id, double amount) {
        if (this.id == id && this.balance >= amount) {
            this.balance -= amount;
            this.transactions++;
        }
    }

    @Override
    public void deposit(int id, double amount) {
        if (this.id == id) {
            this.balance += amount;
            this.transactions++;
        }
    }

    @Override
    public void depositFromATM(int id, double amount) {
        if (this.id == id) {
            this.balance += amount - ATM_TRANSACTION_FEE;
            this.transactions++;
        }
    }

    @Override
    public void withdrawFromATM(int id, double amount) {
       if (this.id == id && this.balance >= amount + ATM_TRANSACTION_FEE) {
            this.balance -= amount + ATM_TRANSACTION_FEE;
            this.transactions++;
        }
    }

    @Override
    public void chargeManagementFees(int id) {
        if (this.id == id) {
            this.balance -= MANAGEMENT_FEE + this.transactions * 0.1;
        }
    }

    public int getid() {
        return this.id;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public int getTransactionsCount() {
        return this.transactions;
    }
    
    public String toString() {
        return "BankAccount[id=" + this.id + ", balance = " + 
                            this.balance + ", transactions = " + 
                            this.transactions + "]";
    }
}
