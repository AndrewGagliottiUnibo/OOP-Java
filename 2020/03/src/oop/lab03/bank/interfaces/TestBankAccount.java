package oop.lab03.bank.interfaces;

//import oop.lab03.bank.AccountHolder; 
import oop.lab03.bank.SimpleBankAccount;
import oop.lab03.bank.StrictBankAccount;

public final class TestBankAccount {

    private TestBankAccount() {
    }

    public static void main(final String[] args) {
        
    	/*
         * 1) Creare l' AccountHolder relativo a Mario Rossi con id 1
         */
    	//AccountHolder holderUser01 = new AccountHolder("Mario", "Rossi", 1);
    	
        /*
         * 2) Creare l' AccountHolder relativo a Luigi Bianchi con id 2
         */
    	//AccountHolder holderUser02 = new AccountHolder("Luigi", "Bianchi", 2);
    	
        /*
         * 3) Dichiarare due variabili di tipo BankAccount ed inizializzarle,
         * rispettivamente, con oggetti di tipo SimpleBankAccount per il conto di Mario
         * Rossi (ammontare iniziale = 0), e di tipo StrictBankAccount per il conto di
         * Luigi Bianchi (ammontare iniziale = 0)
         */
    	BankAccount account01 = new SimpleBankAccount(1);
    	BankAccount account02 = new StrictBankAccount(2);   
    	
        /*
         * 4) Prima riflessione: perché è stato possibile fare la new di due classi
         * diverse in variabili dello stesso tipo?
         */
    	//la prima è l'interfaccia che è implementata dalla seconda, che è la classe.
    	
        /*
         * 5) Depositare €10000 in entrambi i conti
         */
    	account01.deposit(1, 10000);
    	account02.deposit(2, 10000);
    	
        /*
         * 6) Prelevare €15000 da entrambi i conti
         */
    	account01.withdraw(1, 15000);
    	account02.withdraw(2, 15000);
    	
        /*
         * 7) Stampare in stdout l'ammontare corrente
         */
    	System.out.println(account01.getBalance());
    	System.out.println(account02.getBalance());
    	
        /*
         * 8) Qual è il risultato e perché?
         */
    	//il primo va in negativo perchè non ho controlli
    	//il secondo non fa nulla perchè ho controlli
    	
        /*
         * 9) Depositare nuovamente €10000 in entrambi i conti
         */
    	account01.deposit(1, 10000);
    	account02.deposit(2, 10000);
    	
        /*
         * 10) Invocare il metodo computeManagementFees su entrambi i conti
         */
    	account01.chargeManagementFees(1);
    	account02.chargeManagementFees(2);
    	
        /*
         * 11) Stampare a video l'ammontare corrente
         */
    	System.out.println(account01.getBalance());
    	System.out.println(account02.getBalance());
    	
        /*
         * 12) Qual è il risultato e perché?
         */
    	//nel primo stampa l'operazione come ci si apstta
    	//nel secondo stampa il balance con applicate solo le spese di operazione dopo i due depositi

    }
}
