package it.unibo.shapes.impl;

import it.unibo.shapes.api.Shapes;

public class Circle implements Shapes {

    private static final double PI = Math.PI;
    private final double radius;
    
    public Circle(final double radius) {
        this.radius = radius;
    }

    @Override
    public double computePerimeter() {
        return 2 * PI * this.radius;
    }

    @Override
    public double computeArea() {
        return PI * Math.sqrt(this.radius);
    }
    
}
