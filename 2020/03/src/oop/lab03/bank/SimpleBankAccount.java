package oop.lab03.bank;

import oop.lab03.bank.interfaces.BankAccount;

public class SimpleBankAccount implements BankAccount{

	/*
     * Aggiungere i seguenti campi:
     * - double balance: ammontare del conto
     * - int userID: id del possessore del conto (già dichiarato: si veda al riguardo il metodo checkUser dichiarato in fondo alla classe)
     * - int nTransactions: numero delle operazioni effettuate
     * - static double ATM_TRANSACTION_FEE = 1: costo delle operazioni via ATM
     */
	private int userID;
	private double balance;
	private int nTransaction;
	static final double ATM_TRANSACTION_FEE = 1;

    /*
     * Creare un costruttore pubblico che prenda in ingresso un intero (ossia l'id
     * dell'utente) ed un double (ossia, l'ammontare iniziale del conto corrente).
     */
	
	public SimpleBankAccount(final int ID, final double balance) {
		this.setUserID(ID);
		this.setBalance(balance);
	}
	
	//costruttore senza balance
	public SimpleBankAccount(final int ID) {
		this.setUserID(ID);
		this.setBalance(0.0);
	}

    /*
     * Si aggiungano selettori per: 
     * - ottenere l'id utente del possessore del conto
     * - ottenere il numero di transazioni effettuate
     * - ottenere l'ammontare corrente del conto.
     */
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

	/*
     * Incrementa il numero di transazioni e aggiunge amount al totale del
     * conto Nota: il deposito va a buon fine solo se l'id utente
     * corrisponde
     */
    public void deposit(final int usrID, final double amount) {
        if (checkUser(usrID)) {
        	this.setBalance(this.getBalance() + amount);
        	this.nTransaction++;
        }
    }

    /*
     * Incrementa il numero di transazioni e rimuove amount al totale del
     * conto. Note: - Il conto puo' andare in rosso (ammontare negativo) -
     * Il prelievo va a buon fine solo se l'id utente corrisponde
     */
	public void withdraw(final int usrID, final double amount) {
		if (checkUser(usrID)) {
			this.setBalance(this.getBalance() - amount);
        	this.nTransaction++;
        }
    }
	
	/*
     * Incrementa il numero di transazioni e aggiunge amount al totale del
     * conto detraendo le spese (costante ATM_TRANSACTION_FEE) relative
     * all'uso dell'ATM (bancomat) Nota: il deposito va a buon fine solo se
     * l'id utente corrisponde
     */
    public void depositFromATM(final int usrID, final double amount) {
    	if (checkUser(usrID)) {
    		this.setBalance(this.getBalance() + (amount - ATM_TRANSACTION_FEE));
        	this.nTransaction++;
        }
    }

    /*
     * Incrementa il numero di transazioni e rimuove amount + le spese
     * (costante ATM_TRANSACTION_FEE) relative all'uso dell'ATM (bancomat)
     * al totale del conto. Note: - Il conto puo' andare in rosso (ammontare
     * negativo) - Il prelievo va a buon fine solo se l'id utente
     * corrisponde
     */
    public void withdrawFromATM(final int usrID, final double amount) {
    	if (checkUser(usrID)) {
    		this.setBalance(this.getBalance() - (amount + ATM_TRANSACTION_FEE));
        	this.nTransaction++;
        }
    }

    /* Utility method per controllare lo user */
    private boolean checkUser(final int id) {
        return this.getUserID() == id;
    }
    
	public void chargeManagementFees(int usrID) {
		//unused
	}

	public int getTransactionsCount(int usrID) {
		return this.getnTransaction();
	}
}