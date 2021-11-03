package it.unibo.oop.lab.mvc;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * A very simple program using a graphical interface.
 * 
 */
public final class SimpleGUI {

    private final JFrame frame = new JFrame();

    /*
     * Once the Controller is done, implement this class in such a way that:
     * 
     * 1) I has a main method that starts the graphical application
     * 
     * 2) In its constructor, sets up the whole view
     * 
     * 3) The graphical interface consists of a JTextField in the upper part of the frame, 
     * a JTextArea in the center and two buttons below it: "Print", and "Show history". 
     * SUGGESTION: Use a JPanel with BorderLayout
     * 
     * 4) By default, if the graphical interface is closed the program must exit
     * (call setDefaultCloseOperation)
     * 
     * 5) The behavior of the program is that, if "Print" is pressed, the
     * controller is asked to show the string contained in the text field on standard output. 
     * If "show history" is pressed instead, the GUI must show all the prints that
     * have been done to this moment in the text area.
     * 
     */

    /**
     * builds a new {@link SimpleGUI}.
     * @param controller 
     */
    public SimpleGUI(final ControllerImpl controller) {

        final JPanel panel = new JPanel();
        final JPanel sPanel = new JPanel();
        final JTextField text = new JTextField();
        final JTextArea area = new JTextArea();
        final JButton print = new JButton("Print");
        final JButton history = new JButton("Show History");
        
        panel.setLayout(new BorderLayout());
        sPanel.setLayout(new BorderLayout());
        panel.add(text, BorderLayout.NORTH);
        panel.add(area, BorderLayout.CENTER);
        panel.add(sPanel, BorderLayout.SOUTH);
        
        /*
         * Oppure anche con BoxLayout ma mi garba più così.
         * */
        sPanel.add(print, BorderLayout.LINE_START);
        sPanel.add(history, BorderLayout.LINE_END);
        
        print.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(final ActionEvent event) {
                controller.setNextString(text.getText());
                controller.printCurrentString();
                
            }
        });
        
        history.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(final ActionEvent event) {
                final StringBuilder builder = new StringBuilder();
                final List<String> list = controller.getAllStrings();
                for(final String elem : list) {
                    builder.append(elem + "\n");
                }
                if(!list.isEmpty()) {
                    builder.deleteCharAt(builder.length() - 1);
                }
                area.setText(builder.toString());
                
            }
        });
        
        
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
        new SimpleGUI(new ControllerImpl());
    }

}
