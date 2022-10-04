package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Rectangle implements Polygon {

    private static final int N_EDGES = 4;
    private final double lenght;
    private final double height;

    public Rectangle(final double lenght, final double height) {
        this.lenght = lenght;
        this.height = height;
    }

    @Override
    public double computePerimeter() {
        return (this.lenght * 2) + (this.height * 2);
    }

    @Override
    public double computeArea() {
        return this.lenght * this.height;
    }

    @Override
    public int getEdgeCount() {
        return N_EDGES;
    }

}
