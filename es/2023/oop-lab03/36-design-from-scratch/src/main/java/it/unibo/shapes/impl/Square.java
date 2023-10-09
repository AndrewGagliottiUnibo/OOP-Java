package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Square implements Polygon {

    private static final int NUM_EDGES = 4;
    private double side;

    // Constructor
    public Square(final double side) {
        this.side = side;
    }

    // Polygon interface methods
    @Override
    public double computeArea() {
        return Math.pow(this.side, 2);
    }

    @Override
    public double computePerimeter() {
        return this.side * NUM_EDGES;
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
    public double getSide() {
        return this.side;
    }

    public void setSide(final double side) {
        this.side = side;
    }
    
    // toString()
    @Override
    public String toString() {
        return "This is a square with side = " + this.getSide() + "cm " +
                "and area = " + this.computeArea() + "cm^2 " +
                "and perimeter = " + this.computePerimeter() + "cm";
    }
}
