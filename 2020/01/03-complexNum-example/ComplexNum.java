class ComplexNum0 {

    double re;
    double im;

    void build(double re, double im) {
        this.re = re;
        this.im = im;
    }

    boolean equal(ComplexNum0 num) {
        return (num.re == this.re && num.im == this.im);
    }

    void add(ComplexNum0 num) {
      this.re = this.re + num.re;
      this.im = this.im + num.im;
    }

    String toStringRep() {

        if(this.im > 0) {
            return this.re + "+" + this.im + "i";
        }
        return this.re + "" + this.im + "i";
    }
}
