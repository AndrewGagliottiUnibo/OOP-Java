class TestComplexNum {
  public static void main(String[] args) {

        ComplexNum0 c1 = new ComplexNum0();
        ComplexNum0 c2 = new ComplexNum0();
        ComplexNum0 c3 = new ComplexNum0();
        ComplexNum0 c4 = new ComplexNum0();

        c1.build(3, 5);
        c2.build(7, -4);
        c3.build(-2, 3);
        c4.build(-2, 3);

        System.out.println("" + c1.toStringRep());
        System.out.println("" + c2.toStringRep());
        System.out.println("" + c3.toStringRep());
        System.out.println("" + c4.toStringRep());

        c1.add(c2);
       
        System.out.println("" + c1.toStringRep());
        System.out.println("" + c2.toStringRep());
        System.out.println("" + c3.toStringRep());
        System.out.println("" + c4.toStringRep());

        System.out.println("" + c3.equal(c1));
        System.out.println("" + c3.equal(c2));
        System.out.println("" + c3.equal(c4));
  }
}
