package it.unibo.apice.oop.p20patterns.proxy.med;

public class UseAlgorithms {
	
	public static void main(String[] args) {
		Algorithms algorithms = new AlgorithmsImpl();
		int[] vals = new int[] {5,3,7,5,2,3,4,1,0};
		for (int val: vals) {
			int fact = algorithms.factorial(val);
			System.out.println("Fact: " + val + "\t->\t" + fact);
			int fib = algorithms.fibonacci(val);
			System.out.println("Fib : " + val + "\t->\t" + fib);
		}
	}

}
