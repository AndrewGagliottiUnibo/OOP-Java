class ComplexNum {
    /*
     * Inserire qui la dichiarazione dei campi della classe
     */
    private double re;
    private double im;

    void build(final double re, final double im) {
        /*
         * Inserire qui l'inizializzazione dei campi con i parametri forniti in input
         */
        this.re = re;
        this.im = im;
    }

    boolean equal(ComplexNum num) {
        /*
         * Implementare il metodo in modo che restituisca true se e solo se il
         * numero complesso è uguale al parametro num passato in input
         */
        return num.re == this.re && num.im == this.im;
    }

    void add(ComplexNum num) {
        /*
         * Implementare il metodo in modo che venga aggiunto il numero complesso
         * passato in input - Rif. Appendice A1 (slide)
         */
        this.re += num.re;
        this.im += num.im;
    }

    String toStringRep() {

        if(this.im == 0) {
            return this.re + "";
        } else {
            if(this.im < 0) {
                return this.re + "" + this.im + "i";
            } else {
                return this.re + "+" + this.im + "i";
            }
        }
    }

    double getRe() {
        return this.re;
    }

    double getIm() {
        return this.im;
    }
}