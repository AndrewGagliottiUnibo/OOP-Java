package it.unibo.apice.oop.p20patterns.proxy.pre;

public class UseAlgorithms {
	
	public static void main(String[] args) {
		int[] vals = new int[] {5,3,7,5,2,3,4,1,0};
		for (int val: vals) {
			int fact = Algorithms.factorial(val);
			System.out.println("Fact: " + val + "\t->\t" + fact);
			int fib = Algorithms.fibonacci(val);
			System.out.println("Fib : " + val + "\t->\t" + fib);
		}
	}

}
