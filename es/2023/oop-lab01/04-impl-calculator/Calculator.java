class Calculator {

    private int opDone;
    private double lastRes;

    void build() {
        this.opDone = 0;
        this.lastRes = 0;
    }

    // Operations
    double add(final double a, final double b) {
        this.opDone++;
        this.lastRes = a + b;
        return this.lastRes;
    }

    double sub(final double a, final double b) {
        this.opDone++;
        this.lastRes = a - b;
        return this.lastRes;
    }

    double mul(final double a, final double b) {
        this.opDone++;
        this.lastRes = a * b;
        return this.lastRes;
    }

    double div(final double a, final double b) {
        this.opDone++;
        this.lastRes = a / b;
        return this.lastRes;
    }

    // Phase 2 methods
    int nOpDOne() {
        return this.opDone;
    }

    double getLastRes() {
        return this.lastRes;
    }
}