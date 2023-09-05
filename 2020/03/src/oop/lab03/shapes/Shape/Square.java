package oop.lab03.shapes.Shape;

import oop.lab03.shapes.interfaces.Shape.IPolygon;
import java.lang.Math;

public class Square implements IPolygon{
    
    private final double squareEdgeLength;
    static final int NUMBER_OF_EDGES = 4;

    //costruttore
    public Square(final double squareEdge) {
        this.squareEdgeLength = squareEdge;
    }
    
    //getter
    public double getSquareLength() {
        return this.squareEdgeLength;
    }

    //metodi implementati
    public double perimeterCalculator() {
        return NUMBER_OF_EDGES * this.getSquareLength();
    }

    public double areaCalculator() {
        return Math.pow(this.getSquareLength(), 2);
    }

    public int getEdgeCount() {
        return NUMBER_OF_EDGES;
    }
}
