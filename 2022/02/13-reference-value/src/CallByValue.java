class CallByValue {

    void increment(int a) {
        a++;
    }

    public static void main(final String[] args) {
        int x = 1;
        CallByValue cbv = new CallByValue();
        cbv.increment(x);
        System.out.println("x=" + x);
        // rimane uno perché si passa il valore dell'oggetto. il metodo non è chiamato
        // sull'oggetto.
    }
}
