public class ComplexNumCalcolator {

    private int nOpDone;
    private ComplexNumber lastRes = new ComplexNumber();

    public ComplexNumber add(final ComplexNumber first, final ComplexNumber second) {
        this.nOpDone++;
        this.lastRes.build(first.re + second.re, first.im + second.im);
        return this.lastRes;
    }

    public ComplexNumber sub(final ComplexNumber first, final ComplexNumber second) {
        this.nOpDone++;
        this.lastRes.build(first.re - second.re, first.im - second.im);
        return this.lastRes;
    }

    public ComplexNumber mul(final ComplexNumber first, final ComplexNumber second) {
        this.nOpDone++;
        this.lastRes.build((first.re * second.re) - (first.im * second.im),
                (first.im * second.re) + (first.re * second.im));
        return this.lastRes;
    }

    public ComplexNumber div(final ComplexNumber first, final ComplexNumber second) {
        this.nOpDone++;
        this.lastRes.build(
                (((first.re * second.re) + (first.im * second.im)) / (Math.sqrt(second.re) + Math.sqrt(second.im))),
                (((first.im * second.re) - (first.re * second.im)) / (Math.sqrt(second.re) + Math.sqrt(second.im))));
        return this.lastRes;
    }

    public int getOpDone() {
        return this.nOpDone;
    }

    public String getRes() {
        return this.lastRes.toStringRep();
    }
}
