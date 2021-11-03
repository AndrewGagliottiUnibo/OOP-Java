package it.unibo.apice.oop.p18concurrency;

public class PrimeTask implements Runnable {

	private int base;
	private int nNumbers;

	public PrimeTask(int base, int nNumbers) {
		this.base = base;
		this.nNumbers = nNumbers;
	}

	public void run() {
		for (int i = base + 1; i <= base + nNumbers; i++) {
			if (isPrime(i)) {
				System.out.println("" + i);
			}
		}
	}

	private boolean isPrime(int num) {
		int sq = (int) Math.sqrt(num);
		for (int i = 2; i <= sq /* && !stopped */; i++) {
			if ((num % i) == 0) {
				return false;
			}
		}
		return true;
	}
}
