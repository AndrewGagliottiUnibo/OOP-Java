package it.unibo.encapsulation.interfaces;

public class StrictBankAccount implements BankAccount {

    private static final double ATM_TRANSACTION_FEE = 1;
    private static final double TRANSACTIONS_FEE = 0.1;
    private static final double MANAGEMENT_FEE = 5;

    private final int id;
    private double balance;
    private int transactions;

    public StrictBankAccount(final int id, final double amount) {
        this.id = id;
        this.balance = amount;
        this.transactions = 0;
    }

    @Override
    public void withdraw(int id, double amount) {
        if (this.id == id && this.balance > (amount)) {
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
            this.balance += (amount - ATM_TRANSACTION_FEE);
            this.transactions++;
        }
    }

    @Override
    public void withdrawFromATM(int id, double amount) {
        if (this.id == id && this.balance > (amount + ATM_TRANSACTION_FEE)) {
            this.balance -= amount;
            this.balance -= ATM_TRANSACTION_FEE;
            this.transactions++;
        }
    }

    @Override
    public void chargeManagementFees(int id) {
        this.balance -= MANAGEMENT_FEE;
        for (int i = 0; i < this.getTransactionsCount(); i++) {
            // Il proprietario del conto può essere in debito con la banca (mia scelta)
            this.balance -= TRANSACTIONS_FEE;
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

    @Override
    public String toString() {
        return "User: " + this.id + "\n"
                + "Balance: " + this.getBalance() + "\n"
                + "Transactions: " + this.getTransactionsCount() + "\n";
    }
}
