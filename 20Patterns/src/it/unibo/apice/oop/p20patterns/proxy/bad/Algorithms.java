package it.unibo.apice.oop.p20patterns.proxy.bad;

import java.util.HashMap;
import java.util.Map;

public class Algorithms {

	private final static Map<Integer, Integer> factCache = new HashMap<>();

	public static int factorial(int i) {
		if (!factCache.containsKey(i)) {
			factCache.put(i, factorial2(i));
		}
		return factCache.get(i);
	}

	private static int factorial2(int i) {
		return i == 0 ? 1 : i * factorial2(i - 1);
	}

	public static int fibonacci(int i) {
		return i == 0 || i == 1 ? i : fibonacci(i - 1) + fibonacci(i - 2);
	}

}
