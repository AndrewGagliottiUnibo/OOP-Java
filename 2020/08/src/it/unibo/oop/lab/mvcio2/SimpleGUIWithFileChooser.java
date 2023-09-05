package it.unibo.oop.lab.mvcio2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * A very simple program using a graphical interface.
 * 
 */
public final class SimpleGUIWithFileChooser {

    /*
     * TODO: Starting from the application in mvcio:
     * 
     * 1) Add a JTextField and a button "Browse..." on the upper part of the
     * graphical interface.
     * Suggestion: use a second JPanel with a second BorderLayout, put the panel
     * in the North of the main panel, put the text field in the center of the
     * new panel and put the button in the line_end of the new panel. - ??????????????????????
     * 
     * 2) The JTextField should be non modifiable. And, should display the
     * current selected file. - ok
     * 
     * 3) On press, the button should open a JFileChooser. The program should
     * use the method showSaveDialog() to display the file chooser, and if the
     * result is equal to JFileChooser.APPROVE_OPTION the program should set as
     * new file in the Controller the file chosen. If CANCEL_OPTION is returned,
     * then the program should do nothing. Otherwise, a message dialog should be
     * shown telling the user that an error has occurred (use
     * JOptionPane.showMessageDialog()).
     * 
     * 4) When in the controller a new File is set, also the graphical interface
     * must reflect such change. Suggestion: do not force the controller to
     * update the UI: in this example the UI knows when should be updated, so
     * try to keep things separated.
     */

    private final JFrame frame2 = new JFrame("File chooser");
    
    /**
     * View part.
     * @param controller
     */
    private SimpleGUIWithFileChooser(final Controller controller) {
        
        /**
         * The problem is not proposed in an understandable way, i watched professor solution for point 1
         * and read carefully his class.
         */
        final JPanel panel1 = new JPanel();
        final JTextArea text = new JTextArea();
        final JButton saveButton = new JButton("Save");
        panel1.setLayout(new BorderLayout());
        panel1.add(text, BorderLayout.CENTER);
        panel1.add(saveButton, BorderLayout.SOUTH);
        
        /**
         * cut and paste from last exercise
         */
        saveButton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(final ActionEvent event) {
                try {
                    controller.saveString(text.getText());
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        final JTextField filePath = new JTextField(controller.getPath());
        filePath.setEditable(false);
        final JButton browse = new JButton("Browse");
        
        browse.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(final ActionEvent event) {
                final JFileChooser chooser = new JFileChooser("Choose where to save");
                chooser.setSelectedFile(controller.getCurrentFile());
                
                final int result = chooser.showSaveDialog(frame2);
                switch (result) {
                case JFileChooser.APPROVE_OPTION:
                    final File newDestination = chooser.getSelectedFile();
                    controller.setCurrentFile(newDestination);
                    filePath.setText(newDestination.getPath());
                    break;
                
                case JFileChooser.CANCEL_OPTION:
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(frame2, result, "Che vor di", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        final JPanel panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());
        panel2.add(filePath, BorderLayout.CENTER);
        panel2.add(browse, BorderLayout.LINE_END);
        panel1.add(panel2, BorderLayout.NORTH);
        
        final Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        final int sw = (int) screen.getWidth();
        final int sh = (int) screen.getHeight();
        frame2.setSize(sw / 2, sh / 2);
        frame2.setLocationByPlatform(true);
        frame2.setContentPane(panel1);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);
    }
    
    /**
     * Launchs gui.
     * @param args
     */
    public static void main(final String[] args) {
        final SimpleGUIWithFileChooser gui = new SimpleGUIWithFileChooser(new Controller());
        System.out.println(gui.toString() + " loaded");
    }
}
