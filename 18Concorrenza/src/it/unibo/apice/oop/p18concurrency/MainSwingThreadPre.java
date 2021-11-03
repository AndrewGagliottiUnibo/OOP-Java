package it.unibo.apice.oop.p18concurrency;

import javax.swing.*;
import java.awt.event.*;

class MyFrame2 extends JFrame {

	private static final long serialVersionUID = 1L;

	public MyFrame2() {
		super("Test Swing thread");
		setSize(200, 60);
		setVisible(true);
		JButton button = new JButton("test");
		button.addActionListener((ActionEvent ev) -> {
			System.out.println("CIAO");
		});
		getContentPane().add(button);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent ev) {
				System.exit(-1);
			}
		});
	}
}

public class MainSwingThreadPre {
	static public void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new MyFrame2();
		});
		while (true) {
		}
	}
}
