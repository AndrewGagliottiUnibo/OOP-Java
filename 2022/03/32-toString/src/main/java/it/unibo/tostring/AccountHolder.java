package it.unibo.tostring;

public class AccountHolder {

    private final String name;
    private final String surname;
    private final int userID;

    public AccountHolder(final String name, final String surname, final int accountID) {
        this.name = name;
        this.surname = surname;
        this.userID = accountID;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getUserID() {
        return this.userID;
    }

    public String toString() {
        return "Proprietario account: " + this.getName() + " " + this.getSurname() + "\n"
                + "Numero account: " + this.getUserID();
    }

    public static void main(final String[] args) {
        AccountHolder acc = new AccountHolder("Alex", "Ghini", 42);
        System.out.println(acc.toString());
    }
}
