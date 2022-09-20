package it.unibo.oop.lab.mvcio;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 
 */
public class Controller {

    /**
     * As seen before, this is a way seen to access to a file. Created for handle a file.
     */
    private File currentFile = new File(System.getProperty("user.home")
                                        + System.getProperty("file.separator")
                                        + "Output.txt");

    /*
     * This class must implement a simple controller responsible of I/O access. It
     * considers a single file at a time, and it is able to serialize objects in it.
     * 
     * Implement this class with:
     * 
     * 1) A method for setting a File as current file
     * 
     * 2) A method for getting the current File
     * 
     * 3) A method for getting the path (in form of String) of the current File
     * 
     * 4) A method that gets a String as input and saves its content on the current
     * file. This method may throw an IOException.
     * 
     * 5) By default, the current file is "output.txt" inside the user home folder.
     * A String representing the local user home folder can be accessed using
     * System.getProperty("user.home"). The separator symbol (/ on *nix, \ on
     * Windows) can be obtained as String through the method
     * System.getProperty("file.separator"). The combined use of those methods leads
     * to a software that runs correctly on every platform.
     */
    
    /**
     * This is the method to set a file as current file. I was stuck and looked at the solutions.
     */
    public void setCurrentFile(final String string) {
        final File file = new File(string);
        final File parent = file.getParentFile();
        if(parent.exists()) {
            this.currentFile = file;
        } else {
            throw new IllegalArgumentException();
        }
    }
    
    /**
     * currentFile getter.
     * @return currentFile.
     */
    public File getCurrentFile() {
        return this.currentFile;
    }
    
    /**
     * Path getter.
     * @return currentFile Path
     */
    public String getPath() {
        return this.currentFile.getPath();
    }
    
    /**
     * This method write on a currentFile.
     * @param string to write
     */
    public void saveString(final String string) throws IOException {
        try (PrintStream print = new PrintStream(this.getCurrentFile())) {
            print.println(string);
            
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
