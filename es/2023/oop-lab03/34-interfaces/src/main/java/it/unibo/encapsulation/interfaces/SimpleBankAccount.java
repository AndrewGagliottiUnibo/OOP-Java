package it.unibo.encapsulation.interfaces;

public class SimpleBankAccount implements BankAccount {

    /*
     * Aggiungere i seguenti campi:
     * - double balance: ammontare del conto
     * - int transactions: numero delle operazioni effettuate
     * - static double ATM_TRANSACTION_FEE = 1: costo delle operazioni via ATM
     * - static double MANAGEMENT_FEE = 5: costo della gestione conto
     */

    private static final double ATM_TRANSACTION_FEE = 1;
    //private static final double MANAGEMENT_FEE = 5;

    private final int id;
    private double balance;
    private int transactions;

    /*
     * Creare un costruttore pubblico che prenda in ingresso un intero (ossia l'id
     * dell'utente) ed un double (ossia, l'ammontare iniziale del conto corrente).
     */
    public SimpleBankAccount(final int id, final double balance) {
        this.id = id;
        this.balance = balance;
        this.transactions = 0;
    }

    /*
     * Si aggiungano selettori per:
     * - ottenere l'id utente del possessore del conto
     * - ottenere il numero di transazioni effettuate
     * - ottenere l'ammontare corrente del conto.
     */
    public int getid() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getTransactionsCount() {
        return this.transactions;
    }

    public void deposit(final int id, final double amount) {
        /*
         * Incrementa il numero di transazioni e aggiunge amount al totale del
         * conto Nota: il deposito va a buon fine solo se l'id utente
         * corrisponde
         */
        if(this.id == id) {
            this.adjustBalance(amount);
            this.transactions++;
        }
    }

    public void withdraw(final int id, final double amount) {
        /*
         * Incrementa il numero di transazioni e rimuove amount al totale del
         * conto. Note: - Il conto puo' andare in rosso (ammontare negativo) -
         * Il prelievo va a buon fine solo se l'id utente corrisponde
         */
        if(this.id == id) {
            this.adjustBalance(-amount);
            this.transactions++;
        }
    }

    public void depositFromATM(final int id, final double amount) {
        /*
         * Incrementa il numero di transazioni e aggiunge amount al totale del
         * conto detraendo le spese (costante ATM_TRANSACTION_FEE) relative
         * all'uso dell'ATM (bancomat) Nota: il deposito va a buon fine solo se
         * l'id utente corrisponde
         */
        if(this.id == id) {
            this.adjustBalance(amount - ATM_TRANSACTION_FEE);
            this.transactions++;
        }

    }

    public void withdrawFromATM(final int id, final double amount) {
        /*
         * Incrementa il numero di transazioni e rimuove amount + le spese
         * (costante ATM_TRANSACTION_FEE) relative all'uso dell'ATM (bancomat)
         * al totale del conto. Note: - Il conto puo' andare in rosso (ammontare
         * negativo) - Il prelievo va a buon fine solo se l'id utente
         * corrisponde
         */
        if(this.id == id) {
            this.adjustBalance(-amount - ATM_TRANSACTION_FEE);
            this.transactions++;
        }
    }

    private void adjustBalance(final double balance) {
        this.balance += balance;
    }

    public void chargeManagementFees(final int id) {
        //throw new UnsupportedOperationException("Unimplemented method 'getTransactionsCount'" + MANAGEMENT_FEE);
    }

    @Override
    public String toString() {
        return "SimpleBankAccount [id=" + this.id + 
                                ", balance=" + this.balance + 
                                ", transactions=" + this.transactions + "]";
    }
}
