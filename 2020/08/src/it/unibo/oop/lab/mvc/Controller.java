package it.unibo.oop.lab.mvc;

import java.util.List;

/**
 * A controller that prints strings and has memory of the strings it printed.
 */
public interface Controller {

    /**
     * A method for setting the next string to print. Null values are not
     * acceptable, and an exception should be produced
     * 
     * @param nextString
     */
    void setNextString(final String string);
    
    /**
     * A method for getting the next string to print
     */
    String getNextString();
    
    /**
     * A method for getting the history of the printed strings (in form of a List
     * of Strings)
     */
    List<String> getAllStrings();
    
    /**
     * A method that prints the current string. If the current string is unset,
     * an IllegalStateException should be thrown
     */
    void printCurrentString();
}
