package it.unibo.apice.oop.p18concurrency.chrono2;

import javax.swing.*;

public class ChronoView implements ChronoCountListener {

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
	
	@Override
	public void notifyChronoCountChanged(int newValue) {
		SwingUtilities.invokeLater(() -> {
			frame.updateCount(newValue);
		});
	}

}
