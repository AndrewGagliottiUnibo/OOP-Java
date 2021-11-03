package it.unibo.apice.oop.p18concurrency;

public class MainConcurrentSafeCounter {
	public static void main(String[] args) throws Exception {
		// CounterInterface c = new Counter();

		Counter c = new SafeCounter();
		long ntimes = Long.parseLong(args[0]);
		CounterUserA agentA = new CounterUserA(c, ntimes);
		CounterUserB agentB = new CounterUserB(c, ntimes);
		agentA.start();
		agentB.start();
		agentA.join();
		agentB.join();
		System.out.println("Count value: " + c.getValue());
	}
}
