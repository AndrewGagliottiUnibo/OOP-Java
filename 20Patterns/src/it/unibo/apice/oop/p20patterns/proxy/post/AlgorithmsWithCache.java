package it.unibo.apice.oop.p20patterns.proxy.post;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AlgorithmsWithCache implements Algorithms {
	
	private final Algorithms algorithms = new AlgorithmsImpl();
	
	private static enum AlgType { FACTORIAL, FIBONACCI}
	
	private Map<AlgType,Map<Integer,Integer>> map = 
			Stream.of(AlgType.values())
			      .collect(Collectors.toMap(k->k, v->new HashMap<>()));
	
	private int callCached(AlgType algType, int input, 
			               Function<Integer,Integer> computation) {
		return this.map.get(algType).computeIfAbsent(input, computation);
	}
	
	@Override
	public int factorial(int i) {
		return this.callCached(AlgType.FIBONACCI, i, algorithms::factorial);
	}

	@Override
	public int fibonacci(int i) {
		return this.callCached(AlgType.FIBONACCI, i, algorithms::fibonacci);
	}

}
