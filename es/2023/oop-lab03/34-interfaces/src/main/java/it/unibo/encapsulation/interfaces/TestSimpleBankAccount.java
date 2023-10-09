package it.unibo.encapsulation.interfaces;

public class TestSimpleBankAccount {

    private TestSimpleBankAccount() {
        /*
         * Prevents object creation from the outside.
         */
    }

    public static void main(final String[] args) {
        // 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
        AccountHolder andreaRossi = new AccountHolder("Andrea", "Rossi", 1);

        // 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
        AccountHolder alexBianchi = new AccountHolder("Alex", "Bianchi", 2);

        // 3) Creare i due SimpleBankAccount corrispondenti
        SimpleBankAccount andreaRossiAccount = new SimpleBankAccount(andreaRossi.getUserID(), 1000);
        SimpleBankAccount alexBianchiAccount = new SimpleBankAccount(alexBianchi.getUserID(), 2000);

        // 4) Effettuare una serie di depositi e prelievi
        andreaRossiAccount.deposit(andreaRossi.getUserID(), 100);
        alexBianchiAccount.deposit(alexBianchi.getUserID(), 200);
        andreaRossiAccount.withdraw(andreaRossi.getUserID(), 50);
        alexBianchiAccount.withdraw(alexBianchi.getUserID(), 100);

        /*
         * 5) Stampare a video l'ammontare dei due conti e verificare la
         * correttezza del risultato
         */
        System.out.println(andreaRossiAccount.toString());
        System.out.println(alexBianchiAccount.toString());

        // 6) Provare a prelevare fornendo un id utente sbagliato
        andreaRossiAccount.withdraw(alexBianchi.getUserID(), 100);

        // 7) Controllare nuovamente l'ammontare
        System.out.println(andreaRossiAccount.toString());
        System.out.println(alexBianchiAccount.toString());
    }
}
