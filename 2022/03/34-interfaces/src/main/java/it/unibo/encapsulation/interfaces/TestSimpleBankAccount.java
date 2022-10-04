package it.unibo.encapsulation.interfaces;

public class TestSimpleBankAccount {

    private TestSimpleBankAccount() {
        /*
         * Prevents object creation from the outside.
         */
    }

    public static void main(final String[] args) {
        // 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
        // 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
        AccountHolder hold1 = new AccountHolder("Andrea", "Rossi", 1);
        AccountHolder hold2 = new AccountHolder("Alex", "Bianchi", 2);

        // 3) Creare i due SimpleBankAccount corrispondenti
        BankAccount acc1 = new SimpleBankAccount(hold1.getUserID(), 0);
        BankAccount acc2 = new SimpleBankAccount(hold2.getUserID(), 0);

        // 4) Effettuare una serie di depositi e prelievi
        /*
         * 5) Stampare a video l'ammontare dei due conti e verificare la
         * correttezza del risultato
         */
        acc1.deposit(hold1.getUserID(), 2000.0);
        acc2.deposit(hold2.getUserID(), 2000.0);
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());

        acc1.depositFromATM(hold1.getUserID(), 1000.0);
        acc2.depositFromATM(hold2.getUserID(), 1000.0);
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());

        acc1.withdraw(hold1.getUserID(), 500.0);
        acc2.withdraw(hold2.getUserID(), 500.0);
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());

        acc1.withdrawFromATM(hold1.getUserID(), 50.0);
        acc2.withdrawFromATM(hold2.getUserID(), 10.0);
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());

        // 6) Provare a prelevare fornendo un id utente sbagliato
        // 7) Controllare nuovamente l'ammontare
        acc1.withdrawFromATM(hold2.getUserID(), 50.0);
        acc2.withdrawFromATM(hold1.getUserID(), 10.0);
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
    }
}
