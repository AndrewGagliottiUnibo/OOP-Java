package oop.lab03.shapes.Shape;

import oop.lab03.shapes.interfaces.Shape.IPolygon;

public class Triangle implements IPolygon {

    private final double triangleLength;
    private final double triangleHeight;
    private static int CONSTANT_MULTIPLIER = 3;
    private static int COSTANT_DIVIDER = 2;
    
    //costruttore
    public Triangle(final double triangleLength, final double triangleHeight) {
        this.triangleLength = triangleLength;
        this.triangleHeight = triangleHeight;
    }
    
    //getter
    public double getTriangleLength() {
        return this.triangleLength;
    }
    
    public double getTriangleHeight() {
        return this.triangleHeight;
    }

    //metodi da implementare
    public double perimeterCalculator() {
        return CONSTANT_MULTIPLIER * this.getTriangleLength();
    }

    public double areaCalculator() {
        return (this.getTriangleLength() * this.getTriangleHeight()) / COSTANT_DIVIDER;
    }

    public int getEdgeCount() {
        return CONSTANT_MULTIPLIER;
    }
}
