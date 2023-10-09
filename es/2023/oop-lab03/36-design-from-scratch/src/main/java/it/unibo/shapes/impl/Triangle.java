package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Triangle implements Polygon {

    private static final int NUM_EDGES = 3;
    private double side1;
    private double side2;
    private double side3;

    // Constructor
    public Triangle(final double side1, final double side2, final double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Polygon interface methods
    @Override
    public double computeArea() {
        final double semiPerimeter = this.computePerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - this.side1) * 
                (semiPerimeter - this.side2) * (semiPerimeter - this.side3));
    }

    @Override
    public double computePerimeter() {
        return this.side1 + this.side2 + this.side3;
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
    public double getSide1() {
        return this.side1;
    }

    public void setSide1(final double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public void setSide2(final double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public void setSide3(final double side3) {
        this.side3 = side3;
    }

    // toString()
    @Override
    public String toString() {
        return "This is a triangle with side1 = " + this.getSide1() + "cm " +
                "and side2 = " + this.getSide2() + "cm " +
                "and side3 = " + this.getSide3() + "cm " +
                "and area = " + this.computeArea() + "cm^2 " +
                "and perimeter = " + this.computePerimeter() + "cm\n";
    }
}
