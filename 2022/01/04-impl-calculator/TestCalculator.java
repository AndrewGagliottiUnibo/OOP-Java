class TestCalculator {
  public static void main(String[] args) {
	  
      Calculator calc = new Calculator();
      System.out.println(calc.getOpDone() + " " + calc.getRes() + "\n\n");
      System.out.println("1 + 2 = " + calc.add(1, 2));
      System.out.println(calc.getOpDone() + " " + calc.getRes() + "\n\n");
      System.out.println("-1 - 2 = " + calc.sub(-1, 2));
      System.out.println(calc.getOpDone() + " " + calc.getRes() + "\n\n");
      System.out.println("6 * 3 = " + calc.mul(6, 3));
      System.out.println(calc.getOpDone() + " " + calc.getRes() + "\n\n");
      System.out.println("8 / 4 = " + calc.div(8, 4));
      System.out.println(calc.getOpDone() + " " + calc.getRes() + "\n\n");
    }
}
