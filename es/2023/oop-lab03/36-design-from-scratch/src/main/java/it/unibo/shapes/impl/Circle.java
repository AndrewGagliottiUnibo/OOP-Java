package it.unibo.shapes.impl;

import it.unibo.shapes.api.Shape;
import java.lang.Math;

public class Circle implements Shape {

    private static final double PI = Math.PI;
    private double radius;

    // Constructor
    public Circle(final double radius) {
        this.radius = radius;
    }

    // Shape interface methods
	@Override
	public double computeArea() {
		return PI * Math.pow(this.radius, 2);
	}

	@Override
	public double computePerimeter() {
		return 2 * PI * this.radius;
	}

	@Override
	public String getDescription() {
		return this.toString();
	}

    // Getters and setters
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(final double radius) {
        this.radius = radius;
    }

    // toString()
    @Override
    public String toString() {
        return "This is a circle with radius = " + this.getRadius() + "cm " +
                "and area = " + this.computeArea() + "cm^2 " +
                "and perimeter = " + this.computePerimeter() + "cm";
    }  
}
