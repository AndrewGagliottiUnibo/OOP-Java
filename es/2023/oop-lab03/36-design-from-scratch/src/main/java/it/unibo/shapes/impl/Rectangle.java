package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Rectangle implements Polygon {

    private static final int NUM_EDGES = 4;
    private double base;
    private double height;

    // Constructor
    public Rectangle(final double base, final double height) {
        this.base = base;
        this.height = height;
    }

    // Polygon interface methods
    @Override
    public double computeArea() {
        return this.base * this.height;
    }

    @Override
    public double computePerimeter() {
        return 2 * (this.base + this.height);
    }

    @Override
    public String getDescription() {
        return this.toString();
    }

    @Override
    public int getEdgeCount() {
        return NUM_EDGES;
    }

    // Getters and setters
    public double getBase() {
        return this.base;
    }

    public void setBase(final double base) {
        this.base = base;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(final double height) {
        this.height = height;
    }
    
    // toString()
    @Override
    public String toString() {
        return "This is a rectangle with base = " + this.getBase() + "cm " +
                "and height = " + this.getHeight() + "cm " +
                "and area = " + this.computeArea() + "cm^2 " +
                "and perimeter = " + this.computePerimeter() + "cm";
    }
}
