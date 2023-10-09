package it.unibo.shapes.test;

import it.unibo.shapes.api.Polygon;
import it.unibo.shapes.api.Shape;
import it.unibo.shapes.impl.Circle;
import it.unibo.shapes.impl.Rectangle;
import it.unibo.shapes.impl.Square;
import it.unibo.shapes.impl.Triangle;

public class WorkWithShapes {

    private WorkWithShapes() { }
    
    public static void main(String args[]) {
        // Shapes and Polygons
    Shape circle = new Circle(5);
    Polygon square = new Square(4);
    Polygon rectangle = new Rectangle(3, 4);
    Polygon triangle = new Triangle(3, 4, 5);

    // Shapes and Polygons data
        System.out.println(circle.getDescription());
        System.out.println(square.getDescription());
        System.out.println(rectangle.getDescription());
        System.out.println(triangle.getDescription());
    }
}
    
