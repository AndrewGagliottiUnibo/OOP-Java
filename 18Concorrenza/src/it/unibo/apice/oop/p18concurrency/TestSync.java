package it.unibo.apice.oop.p18concurrency;

public class TestSync {
	Object lock = new Object();
	
	public void m1() {
		synchronized (lock) {
			System.out.println("x");
		
		}
	}

	public void m2() {
		synchronized (lock) {
			System.out.println("x");
		
		}
	}
}

