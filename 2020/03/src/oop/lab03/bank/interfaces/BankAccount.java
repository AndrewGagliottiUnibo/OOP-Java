package oop.lab03.bank.interfaces;

public interface BankAccount {
    void withdraw(final int usrID, final double amount);

    void deposit(final int usrID, final double amount);

    void depositFromATM(final int usrID, final double amount);

    void withdrawFromATM(final int usrID, final double amount);

    /*
     * This method is used to charge the management fees on the account balance
     * (they are computed every few months). This method does not return the amount
     * computed, it directly collects the amount from the balance.
     */
    void chargeManagementFees(final int usrID);

    double getBalance();

    int getTransactionsCount(final int usrID);
}
