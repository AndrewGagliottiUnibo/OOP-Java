package it.unibo.apice.oop.p18concurrency.chrono;

public class MainChrono {
	public static void main(String[] args) {

		ChronoCount c = new ChronoCount(0);
		Controller controller = new ChronoController(c);
		ChronoView view = new ChronoView(c.getValue(), controller);
		controller.attachView(view);
		view.show();

	}
}
