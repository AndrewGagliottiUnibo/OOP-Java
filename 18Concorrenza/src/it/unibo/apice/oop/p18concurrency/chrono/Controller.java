package it.unibo.apice.oop.p18concurrency.chrono;

public interface Controller {

	void attachView(ChronoView view);
	void notifyStarted();
	void notifyStopped();
	void notifyReset();

}
