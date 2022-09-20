package oop.lab03.shapes.Shape;

import java.lang.Math;
import oop.lab03.shapes.interfaces.Shape.IShape;

public class Circle implements IShape {
    
    private final double radius;
    private static int COSTANT_MULTIPLIER = 2;
    
    //costruttore
    public Circle(double radius) {
        this.radius = radius;
    }

    //getter
    public double getRadius() {
        return this.radius;
    }
    
    //perimetro
    public double perimeterCalculator() {
        return COSTANT_MULTIPLIER * (Math.PI * this.getRadius());
    }

    //area
    public double areaCalculator() {
        return Math.PI * Math.pow(this.getRadius(), COSTANT_MULTIPLIER);
    }

}
