public class ComplexNumber {
    public double re;
    public double im;

    public ComplexNumber() { }

    void build(double re, double im) {
        this.re = re;
        this.im = im;
    }

    boolean equal(ComplexNumber num) {
        return this.re == num.re && this.im == num.im ? true : false;
    }

    void add(ComplexNumber num) {
        this.re += num.re;
        this.im += num.im;
    }

    public String toStringRep() {
        return this.im == 0 ? 
                "" + this.re
                : (this.im < 0 ? 
                    (this.im == -1 ? this.re + "-i" : this.re + "" + this.im + "i") 
                    : (this.im == 1 ? this.re + "+i" : this.re + "+" + this.im + "i") );
    }
}
