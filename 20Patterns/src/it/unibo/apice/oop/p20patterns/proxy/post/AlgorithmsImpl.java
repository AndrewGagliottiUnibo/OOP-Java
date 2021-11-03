package it.unibo.apice.oop.p20patterns.proxy.post;

public class AlgorithmsImpl implements Algorithms {

	@Override
	public int factorial(int i) {
		return i == 0 ? 1 : i * factorial(i - 1);
	}

	@Override
	public int fibonacci(int i) {
		return i == 0 || i == 1 ? i : fibonacci(i - 1) + fibonacci(i - 2);
	}

}
