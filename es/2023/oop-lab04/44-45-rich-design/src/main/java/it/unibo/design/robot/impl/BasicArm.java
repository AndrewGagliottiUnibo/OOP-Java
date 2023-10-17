package it.unibo.design.robot.impl;

public class BasicArm {

    private static final double MOVING_CONSUMPTION = 0.2;
    private static final double GRABBING_CONSUMPTION = 0.1;

    private boolean isGrabbed;
    private final String name;

    // Constructor
    public BasicArm(final String name) {
        this.name = name;
    }

    // Actions performed
    public void pickUp() {
        this.isGrabbed = true;
    }

    public void dropDown() {
        this.isGrabbed = false;
    }

    // Getters
    public boolean isGrabbed() {
        return this.isGrabbed;
    }

    public double getConsuptionForPickUp() {
        return MOVING_CONSUMPTION + GRABBING_CONSUMPTION;
    }

    public double getConsuptionForDropDown() {
        return MOVING_CONSUMPTION;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
