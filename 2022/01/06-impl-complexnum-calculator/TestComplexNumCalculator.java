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
      ComplexNumCalcolator calculator = new ComplexNumCalcolator();
      ComplexNumber num1 = new ComplexNumber();
      ComplexNumber num2 = new ComplexNumber();
      ComplexNumber num3 = new ComplexNumber();
      ComplexNumber num4 = new ComplexNumber();
      ComplexNumber num5 = new ComplexNumber();
      ComplexNumber num6 = new ComplexNumber();

      num1.build(1, 2);
      num2.build(2, 3);
      num3.build(4, 5);
      num4.build(6, 7);
      num5.build(8, 2);
      num6.build(3, -1);

      System.out.println(calculator.getOpDone() + "\n");

      System.out.println(calculator.add(num1, num2).toStringRep());
      System.out.println(calculator.getOpDone() + "\n");
      System.out.println(calculator.sub(num3, num4).toStringRep());
      System.out.println(calculator.getOpDone() + "\n");
      System.out.println(calculator.mul(num5, num6).toStringRep());
      System.out.println(calculator.getOpDone() + "\n");
      System.out.println(calculator.div(num6, num1).toStringRep());
      System.out.println(calculator.getOpDone() + "\n");
  }
}
