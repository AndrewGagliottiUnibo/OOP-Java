package oop.lab03.shapes.Shape;

import oop.lab03.shapes.interfaces.Shape.IPolygon;

public class Rectangle implements IPolygon {

    private final double rectangleLength;
    private final double rectangleHeight;
    static final int COSTANT_MULTIPLIER = 2;
    
    //costruttore
    public Rectangle(double rectangleLength, double rectangleHeight) {
        this.rectangleLength = rectangleLength;
        this.rectangleHeight = rectangleHeight;
    }

    //getter
    public double getRectangleLength() {
        return this.rectangleLength;
    }


    public double getRectangleHeight() {
        return this.rectangleHeight;
    }

    //perimetro
    public double perimeterCalculator() {
        return (this.getRectangleHeight() + this.getRectangleLength()) * COSTANT_MULTIPLIER;
    }

    //area
    public double areaCalculator() {
        return this.getRectangleHeight() * this.getRectangleLength();
    }

    //lati
    public int getEdgeCount() {
        return COSTANT_MULTIPLIER * COSTANT_MULTIPLIER;
    }
}
