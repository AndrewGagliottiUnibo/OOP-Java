package oop.lab03.bank;

import oop.lab03.bank.interfaces.BankAccount;

public class StrictBankAccount implements BankAccount {

	private int userID;
	private double balance;
	private int nTransaction;
	static final double ATM_TRANSACTION_FEE = 1;
	static final int COSTANT_FEE_PAYMENT = 5;
	static final double MULTIPLIER_VALUE = 0.1;

	public StrictBankAccount(final int ID, final double balance) {
		this.setUserID(ID);
		this.setBalance(balance);
	}
	
	//costruttore senza balance
	public StrictBankAccount(final int ID) {
		this.setUserID(ID);
		this.setBalance(0.0);
	}

	//getter
	public int getUserID() {
		return userID;
	}


	public double getBalance() {
		return balance;
	}

	public int getnTransaction() {
		return nTransaction;
	}

	//setter
	public void setUserID(int userID) {
		this.userID = userID;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setnTransaction(int nTransaction) {
		this.nTransaction = nTransaction;
	}

	//operazioni
    public void deposit(final int usrID, final double amount) {
        if (checkUser(usrID)) {
        	this.setBalance(this.getBalance() + amount);
        	this.nTransaction++;
        }
    }

	public void withdraw(final int usrID, final double amount) {
		if (checkUser(usrID) &&  this.getBalance() >= amount) {
			this.setBalance(this.getBalance() - amount);
        	this.nTransaction++;
        }
    }
	
    public void depositFromATM(final int usrID, final double amount) {
    	if (checkUser(usrID)) {
    		this.setBalance(this.getBalance() + (amount - ATM_TRANSACTION_FEE));
        	this.nTransaction++;
        }
    }

    public void withdrawFromATM(final int usrID, final double amount) {
    	if (checkUser(usrID)  &&  this.getBalance() >= (amount + ATM_TRANSACTION_FEE)) {
    		this.setBalance(this.getBalance() - (amount + ATM_TRANSACTION_FEE));
        	this.nTransaction++;
        }
    }

    /* Utility method per controllare lo user */
    private boolean checkUser(final int id) {
        return this.getUserID() == id;
    }

    //metodi di contratto
    //uso il cast a float per rendere più decente il bug di stampa che ho con il casting di default a double
	public void chargeManagementFees(final int usrID) {
		if(checkUser(usrID)) {
			this.setBalance((float) this.getBalance() - COSTANT_FEE_PAYMENT - ((float) this.getnTransaction() * MULTIPLIER_VALUE));
		}
	}

	//metodo di contratto
	public int getTransactionsCount(final int usrID) {
		if(checkUser(usrID)) {
			return this.getnTransaction();
		}
		//se non è corretto ritorno un intero che indica un errore in quanto una transazione non va mai in negativo
		else {
			return -1;
		}
	}
}
