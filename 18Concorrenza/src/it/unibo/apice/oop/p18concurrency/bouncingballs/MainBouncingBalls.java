package it.unibo.apice.oop.p18concurrency.bouncingballs;

/**
 * SISOP 08/09
 *
 * @author Alessandro Ricci
 */
public class MainBouncingBalls {

	public static void main(String[] args) {

		Context ctx = new Context();

		Visualiser viewer = new Visualiser(ctx);
		viewer.start();

		ControlPanel control = new ControlPanel(ctx);
		control.setVisible(true);
	}
}
