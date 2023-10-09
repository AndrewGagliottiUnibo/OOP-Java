package it.unibo.encapsulation.interfaces;

public class TestBankAccount {

    private TestBankAccount() {
    }

    public static void main(final String[] args) {
        /*
         * 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
         */
        AccountHolder andreaRossi = new AccountHolder("Andrea", "Rossi", 1);

        /*
         * 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
         */
        AccountHolder alexBianchi = new AccountHolder("Alex", "Bianchi", 2);

        /*
         * 3) Dichiarare due variabili di tipo BankAccount ed inizializzarle,
         * rispettivamente, con oggetti di tipo SimpleBankAccount per il conto di
         * Rossi (ammontare iniziale = 0), e di tipo StrictBankAccount per il conto di
         * Bianchi (ammontare iniziale = 0)
         */
        BankAccount andreaRossiAccount = new SimpleBankAccount(andreaRossi.getUserID(), 0);
        BankAccount alexBianchiAccount = new StrictBankAccount(alexBianchi.getUserID());

        /*
         * 5) Depositare €10000 in entrambi i conti
         */
        andreaRossiAccount.deposit(andreaRossi.getUserID(), 10000);
        alexBianchiAccount.deposit(alexBianchi.getUserID(), 10000);

        /*
         * 6) Prelevare €15000$ da entrambi i conti
         */
        andreaRossiAccount.withdraw(andreaRossi.getUserID(), 15000);
        alexBianchiAccount.withdraw(alexBianchi.getUserID(), 15000);
        /*
         * 7) Stampare in stdout l'ammontare corrente
         */
        System.out.println("Andrea Rossi: " + andreaRossiAccount.getBalance());
        System.out.println("Alex Bianchi: " + alexBianchiAccount.getBalance());

        /*
         * 9) Depositare nuovamente €10000 in entrambi i conti
         */
        andreaRossiAccount.deposit(andreaRossi.getUserID(), 10000);
        alexBianchiAccount.deposit(alexBianchi.getUserID(), 10000);
        System.out.println(andreaRossiAccount.toString());
        System.out.println(alexBianchiAccount.toString() + "\n");

        /*
         * 10) Invocare il metodo computeManagementFees su entrambi i conti
         */
        andreaRossiAccount.chargeManagementFees(andreaRossi.getUserID());
        alexBianchiAccount.chargeManagementFees(alexBianchi.getUserID());
        System.out.println(andreaRossiAccount.toString());
        System.out.println(alexBianchiAccount.toString() + "\n");

        /*
         * 11) Stampare a video l'ammontare corrente
         */
        System.out.println("Andrea Rossi: " + andreaRossiAccount.getBalance());
        System.out.println("Alex Bianchi: " + alexBianchiAccount.getBalance());
    }
}
