class ComplexNumCalculator {
    private int nOpDone;
    private ComplexNum lastRes;

    void build() {
        this.nOpDone = 0;
        this.lastRes = new ComplexNum();
    }

    ComplexNum add(final ComplexNum a, final ComplexNum b) {
        this.nOpDone++;
        this.lastRes.build(a.getRe() + b.getRe(), a.getIm() + b.getIm());
        return this.lastRes;
    }

    ComplexNum sub(final ComplexNum a, final ComplexNum b) {
        this.nOpDone++;
        this.lastRes.build(a.getRe() - b.getRe(), a.getIm() - b.getIm());
        return this.lastRes;
    }

    ComplexNum mul(final ComplexNum a, final ComplexNum b) {
        this.nOpDone++;
        this.lastRes.build(a.getRe() * b.getRe() - a.getIm() * b.getIm(), 
                            a.getIm() * b.getRe() + a.getRe() * b.getIm());
        return this.lastRes;
    }

    ComplexNum div(final ComplexNum a, final ComplexNum b) {
        this.nOpDone++;
        this.lastRes.build((a.getRe() * b.getRe() + a.getIm() * b.getIm()) / 
                            Math.sqrt(b.getRe()) + Math.sqrt(b.getIm()), 
                            (a.getIm() * b.getRe() - a.getRe() * b.getIm()) /
                            Math.sqrt(b.getRe()) + Math.sqrt(b.getIm()));
        return this.lastRes;
    }

    int getnOpDone() {
        return this.nOpDone;
    }
}