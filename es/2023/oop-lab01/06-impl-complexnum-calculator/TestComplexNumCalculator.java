class TestComplexNumCalculator {
  public static void main(String[] args) {
      /*
       * 1) Testare la classe ComplexNumCalculator con le seguenti operazioni
       *    tra numeri complessi:
       *
       * - add(1+2i, 2+3i) = 3+5i
       *
       * - sub(4+5i, 6+7i) = -2-2i
       *
       * - mul(8+2i, 3-i) = 26 - 2i
       *
       * - ... altre a piacere
       *
       * 2) Verificare il corretto valore dei campi nOpDone, lastRes
       *
       * 3) Fare altre prove con operazioni a piacere
       */

      // Initializations
      ComplexNumCalculator cnc = new ComplexNumCalculator();
      ComplexNum c1 = new ComplexNum();
      ComplexNum c2 = new ComplexNum();
      ComplexNum c3 = new ComplexNum();
      ComplexNum c4 = new ComplexNum();
      ComplexNum c5 = new ComplexNum();
      ComplexNum c6 = new ComplexNum();

      // Constructors
      cnc.build();
      c1.build(1, 2);
      c2.build(2, 3);
      c3.build(4, 5);
      c4.build(6, 7);
      c5.build(8, 2);
      c6.build(3, -1);

      // Tests
      System.out.println(cnc.add(c1, c2).toStringRep());
      System.out.println(cnc.sub(c3, c4).toStringRep());
      System.out.println(cnc.mul(c5, c6).toStringRep());
      System.out.println(cnc.div(c3, c5).toStringRep());
  }
}
