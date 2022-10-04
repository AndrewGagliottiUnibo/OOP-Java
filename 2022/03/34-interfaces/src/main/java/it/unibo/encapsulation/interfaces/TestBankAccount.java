package it.unibo.encapsulation.interfaces;

public class TestBankAccount {

    private TestBankAccount() {
    }

    public static void main(final String[] args) {
        /*
         * 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
         */
        /*
         * 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
         */
        AccountHolder hold1 = new AccountHolder("Andrea", "Rossi", 1);
        AccountHolder hold2 = new AccountHolder("Alex", "Bianchi", 2);

        /*
         * 3) Dichiarare due variabili di tipo BankAccount ed inizializzarle,
         * rispettivamente, con oggetti di tipo SimpleBankAccount per il conto di
         * Rossi (ammontare iniziale = 0), e di tipo StrictBankAccount per il conto di
         * Bianchi (ammontare iniziale = 0)
         */
        BankAccount acc1 = new SimpleBankAccount(hold1.getUserID(), 0);
        BankAccount acc2 = new StrictBankAccount(hold2.getUserID(), 0);

        /*
         * 4) Prima riflessione: perché è stato possibile fare la new di due classi
         * diverse in variabili dello stesso tipo?
         * 
         * Perché secondo le gerarchie fra classi di Java si può usare un sottotipo
         * laddove ci si aspetta che ci sia un sopratipo. E' uno dei meccanismi alla
         * base
         * della ereditarietà che poi si va ad arricchire con estendibilità e
         * polimorfismo.
         */

        /*
         * 5) Depositare €10000 in entrambi i conti
         */
        acc1.deposit(hold1.getUserID(), 10000.0);
        acc2.deposit(hold2.getUserID(), 10000.0);
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());

        /*
         * 6) Prelevare €15000$ da entrambi i conti
         */
        /*
         * 7) Stampare in stdout l'ammontare corrente
         */
        acc1.withdraw(hold1.getUserID(), 15000.0);
        acc2.withdraw(hold2.getUserID(), 15000.0);
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());

        /*
         * 8) Qual è il risultato e perché?
         * Controllo sulla non negatività del conto di tipo Strict.
         */

        /*
         * 9) Depositare nuovamente €10000 in entrambi i conti
         */
        acc1.deposit(hold1.getUserID(), 10000.0);
        acc2.deposit(hold2.getUserID(), 10000.0);
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());

        /*
         * 10) Invocare il metodo computeManagementFees su entrambi i conti
         */
        /*
         * 11) Stampare a video l'ammontare corrente
         */
        acc1.chargeManagementFees(hold1.getUserID());
        acc2.chargeManagementFees(hold2.getUserID());
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());

        /*
         * 12) Qual è il risultato e perché?
         * L'account di tipo Strict è sottoposto a tasse aggiuntive per ogni operazione
         * compiuta.
         */
    }
}
