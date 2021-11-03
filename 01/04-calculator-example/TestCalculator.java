class TestCalculator {
  public static void main(String[] args) {
    class Calculator {

      int nOpDone;
      double lastRes;

      void build(){
        nOpDone = 0;
        lastRes = 0;
      }

      double add(double num1, double num2) {
        this.nOpDone = this.nOpDone + 1;
        this.lastRes = num1 + num2;
        return lastRes;
      }
      double sub(double num1, double num2) {
        this.nOpDone = this.nOpDone + 1;
        this.lastRes = num1 - num2;
        return lastRes;
      }
      double mul(double num1, double num2) {
        this.nOpDone = this.nOpDone + 1;
        this.lastRes = num1 * num2;
        return lastRes;
      }
      double div(double num1, double num2) {
        this.nOpDone = this.nOpDone + 1;
        this.lastRes = num1 / num2;
        return lastRes;
      }
  }

      Calculator calc = new Calculator();
      calc.build();
      System.out.println("\n1 + 2 =" + calc.add(1, 2));
      System.out.println("Operazioni compiute: " + calc.nOpDone);
      System.out.println("Ultimo Risultato: "  + calc.lastRes);
      System.out.println("\n-1 - 2 =" + calc.sub(-1, 2));
      System.out.println("Operazioni compiute: " + calc.nOpDone);
      System.out.println("Ultimo Risultato: "  + calc.lastRes);
      System.out.println("\n6 * 3 =" + calc.mul(6, 3));
      System.out.println("Operazioni compiute: " + calc.nOpDone);
      System.out.println("Ultimo Risultato: "  + calc.lastRes);
      System.out.println("\n8 / 4 =" + calc.div(8, 4));
      System.out.println("Operazioni compiute: " + calc.nOpDone);
      System.out.println("Ultimo Risultato: "  + calc.lastRes);
  }
}
