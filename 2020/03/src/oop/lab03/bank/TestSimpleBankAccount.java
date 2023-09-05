package oop.lab03.bank;

public final class TestSimpleBankAccount {

    private TestSimpleBankAccount() { }

    public static void main(final String[] args) {
        
    	/*
         * 1) Creare l' AccountHolder relativo a Mario Rossi con id 1 2) Creare
         * l' AccountHolder relativo a Luigi Bianchi con id 2 3) Creare i due
         * SimpleBankAccount corrispondenti 4) Effettuare una serie di depositi e
         * prelievi 5) Stampare a video l'ammontare dei due conti e verificare
         * la correttezza del risultato 6) Provare a prelevare fornendo un idUsr
         * sbagliato 7) Controllare nuovamente l'ammontare
         */
    	//holder
    	AccountHolder holderUser01 = new AccountHolder("Mario", "Rossi", 1);
    	AccountHolder holderUser02 = new AccountHolder("Luigi", "Bianchi", 2);
    	
    	//bank account
    	SimpleBankAccount accountUser01 = new SimpleBankAccount(holderUser01.getUserID());
    	SimpleBankAccount accountUser02 = new SimpleBankAccount(holderUser02.getUserID());
    
    	//deposito e prelievo, l'errore dell'ID è voluto
    	accountUser01.deposit(1, 54360.0);
    	accountUser02.deposit(2, 54360.0);
    	accountUser01.withdraw(1, 10000.0);
    	accountUser02.withdraw(1, 10000.0);
    	
    	//stampo balance
    	System.out.println(accountUser01.getBalance());
    	System.out.println(accountUser02.getBalance()+ "\n");
    	
    	//deposito e prelievo con ATM
    	accountUser01.depositFromATM(1, 100.0);
    	accountUser02.depositFromATM(2, 100.0);
    	accountUser01.withdrawFromATM(1, 10000.0);
    	accountUser02.withdrawFromATM(2, 10000.0);
    	
    	//stampo balance
    	System.out.println(accountUser01.getBalance());
    	System.out.println(accountUser02.getBalance());
    }
}
