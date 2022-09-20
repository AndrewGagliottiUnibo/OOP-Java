class Calculator {
     
    private int nOpDone;
    private double lastRes;

    Calculator() { 
        this.nOpDone = 0;
        this.lastRes = 0.0;
    }

    /* Phase 1 */
    public double add(final double first, final double second){
        this.nOpDone++;
        this.lastRes = first + second;
        return this.lastRes;
    }

    public double sub(final double first, final double second){
        this.nOpDone++;
        this.lastRes = first - second;
        return this.lastRes;
    }

    public double mul(final double first, final double second){
        this.nOpDone++;
        this.lastRes = first * second;
        return this.lastRes;
    }

    public double div(final double first, final double second){
        this.nOpDone++;
        this.lastRes = first / second;
        return this.lastRes;
    }

    /* Phase 2 */
    public int getOpDone() {
        return this.nOpDone;
    }

    public double getRes() {
        return this.lastRes;
    }
}