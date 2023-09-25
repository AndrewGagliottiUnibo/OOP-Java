class TestCalculator {
  public static void main(String[] args) {
      Calculator calc = new Calculator();
      calc.build();

      System.out.println("1 + 2 =" + calc.add(1, 2));
      System.out.println("Op done: " + calc.nOpDOne() + "\n");

      System.out.println("-1 - 2 =" + calc.sub(-1, 2));
      System.out.println("Op done: " + calc.nOpDOne() + "\n");

      System.out.println("6 * 3 =" + calc.mul(6, 3));
      System.out.println("Op done: " + calc.nOpDOne() + "\n");
      
      System.out.println("8 / 4 =" + calc.div(8, 4));
      System.out.println("Op done: " + calc.nOpDOne() + "\n");
  }
}
