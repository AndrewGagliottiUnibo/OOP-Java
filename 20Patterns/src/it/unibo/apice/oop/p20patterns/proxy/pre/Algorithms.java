package it.unibo.apice.oop.p20patterns.proxy.pre;

public class Algorithms {
	
	// Problem: add caching for input -> output
	 
	public static int factorial(int i) {
		return i==0 ? 1 : i*factorial(i-1); 
	}
	
	public static int fibonacci(int i) {
		return i==0 || i==1 ? i : fibonacci(i-1)+fibonacci(i-2); 
	}

}
