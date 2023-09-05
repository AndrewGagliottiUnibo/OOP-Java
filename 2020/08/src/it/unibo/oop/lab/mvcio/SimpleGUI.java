package it.unibo.oop.lab.mvcio;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * A very simple program using a graphical interface.
 * 
 */
public final class SimpleGUI {

    /*
     * Once the Controller is done, implement this class in such a way that:
     * 
     * 1) It has a main method that starts the graphical application - ok
     * 
     * 2) In its constructor, sets up the whole view - ok
     * 
     * 3) The graphical interface consists of a JTextArea with a button "Save" right
     * below (see "ex02.png" for the expected result). SUGGESTION: Use a JPanel with
     * BorderLayout
     * 
     * 4) By default, if the graphical interface is closed the program must exit
     * (call setDefaultCloseOperation)
     * 
     * 5) The program asks the controller to save the file if the button "Save" gets
     * pressed.
     * 
     * Use "ex02.png" (in the res directory) to verify the expected aspect.
     */
    
    /*
     * Creating a new frame
     * */
    private final JFrame frame = new JFrame("New Frame, write down here ..");
    
    /**
     * builds a new {@link SimpleGUI}.
     */
    public SimpleGUI(final Controller controller) {
        
        /**
         * Setting components for GUI
         */
        final JPanel panel = new JPanel();
        final JTextArea text = new JTextArea();
        final JButton button = new JButton("Save");
        panel.setLayout(new BorderLayout());
        panel.add(text, BorderLayout.CENTER);
        panel.add(button, BorderLayout.SOUTH);
        
        /**
         * Setting up listener for the button.
         */
        button.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(final ActionEvent event) {
                try {
                    controller.saveString(text.getText());
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        
        /**
         * Setting stuff for representation
         */
        final Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        final int sw = (int) screen.getWidth();
        final int sh = (int) screen.getHeight();
        frame.setSize(sw / 2, sh / 2);
        frame.setLocationByPlatform(true);
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(final String[] args) {
        final SimpleGUI gui = new SimpleGUI(new Controller());
        System.out.println(gui.toString() + " loaded correctly");
    }
}
