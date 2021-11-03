package it.unibo.oop.lab.mvc;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class ControllerImpl implements Controller {
    
    /**
     * Fields, linked list
     */
    private final List<String> list = new LinkedList<>();
    private String nextString;

    @Override
    public void setNextString(final String string) {
        this.nextString = Objects.requireNonNull(string, "No null values");

    }

    @Override
    public String getNextString() {
        return this.nextString;
    }

    @Override
    public List<String> getAllStrings() {
        return this.list;
    }

    @Override
    public void printCurrentString() {
        if(this.getNextString() == null) {
            throw new IllegalStateException("No string available");
        }
        
        this.list.add(this.getNextString());
        System.out.println(this.nextString);

    }

}
