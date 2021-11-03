package it.unibo.apice.oop.p20patterns.proxy.pro;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class AlgorithmsWithCache implements Algorithms {
	
	private final Algorithms algorithms = new AlgorithmsImpl();
	
	private static enum AlgType { FACTORIAL, FIBONACCI}
	
	private Map<AlgType,Map<Integer,Integer>> map = new EnumMap<>(AlgType.class) {{
		this.put(AlgType.FACTORIAL, new HashMap<>());
		this.put(AlgType.FIBONACCI, new HashMap<>());
	}};
	
	@Override
	public int factorial(int i) {
		if (!this.map.get(AlgType.FACTORIAL).containsKey(i)) {
			System.out.println("computing");
			this.map.get(AlgType.FACTORIAL).put(i,this.algorithms.factorial(i));
		} 
		return this.map.get(AlgType.FACTORIAL).get(i);
	}

	@Override
	public int fibonacci(int i) {
		if (!this.map.get(AlgType.FIBONACCI).containsKey(i)) {
			System.out.println("computing");
			this.map.get(AlgType.FIBONACCI).put(i,this.algorithms.fibonacci(i));
		} 
		return this.map.get(AlgType.FIBONACCI).get(i);
	}

}
