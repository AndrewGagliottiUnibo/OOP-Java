package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Triangle implements Polygon {

    private static final int N_EDGES = 3;
    private final double base;
    private final double wide1;
    private final double wide2;
    private final double height;

    public Triangle(final double base, final double wide1, final double wide2, final double height) {
        this.base = base;
        this.wide1 = wide1;
        this.wide2 = wide2;
        this.height = height;
    }

    @Override
    public double computePerimeter() {
        return this.base + this.wide1 + this.wide2;
    }

    @Override
    public double computeArea() {
        return (this.base * this.height) / 2;
    }

    @Override
    public int getEdgeCount() {
        return N_EDGES;
    }

    @Override
    public String toString() {
        return "Triangle [base=" + base + ", wide1=" + wide1 + ", wide2=" + wide2 + ", height=" + height + "]\n"
                + "[Perimeter = " + this.computePerimeter() + "]\n"
                + "[Area = " + this.computeArea() + "]\n"
                + "[Edges = " + this.getEdgeCount() + "]\n\n";
    }

}
