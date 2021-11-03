package it.unibo.apice.oop.p18concurrency.chrono;

import javax.swing.*;

public class ChronoView {

	private ChronoFrame frame;

	public ChronoView(int initialCount, Controller controller) {
		frame = new ChronoFrame(initialCount, controller);
	}

	public void show() {
		try {
			SwingUtilities.invokeAndWait(() -> {
				frame.setVisible(true);
			});
		} catch (Exception ex) {}
	}
	
	public void updateCount(int value) {
		SwingUtilities.invokeLater(() -> {
			frame.updateCount(value);
		});
	}

}
