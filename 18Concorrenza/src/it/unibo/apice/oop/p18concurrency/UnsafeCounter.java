package it.unibo.apice.oop.p18concurrency;
/**
 * Unsafe Counter.
 * 
 * @NotThreadSafe
 * 
 * @author aricci
 *
 */
public class UnsafeCounter implements Counter {

	private long cont;

	public UnsafeCounter() {
		cont = 0;
	}

	public void inc() {
		cont++;
	}

	public void dec() {
		cont--;
	}

	public long getValue() {
		return cont;
	}
}
