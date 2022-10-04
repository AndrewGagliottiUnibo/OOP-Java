package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Square implements Polygon {

    private static final int N_EDGES = 4;
    private final double wide;

    public Square(final double wide) {
        this.wide = wide;
    }

    @Override
    public double computePerimeter() {
        return this.wide * N_EDGES;
    }

    @Override
    public double computeArea() {
        return Math.sqrt(this.wide);
    }

    @Override
    public int getEdgeCount() {
        return N_EDGES;
    }
}
