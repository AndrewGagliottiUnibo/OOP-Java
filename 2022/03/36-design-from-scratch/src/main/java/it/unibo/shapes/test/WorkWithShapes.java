package it.unibo.shapes.test;

import it.unibo.shapes.api.Polygon;
import it.unibo.shapes.api.Shapes;
import it.unibo.shapes.impl.Circle;
import it.unibo.shapes.impl.Rectangle;
import it.unibo.shapes.impl.Square;
import it.unibo.shapes.impl.Triangle;

public class WorkWithShapes {
    private static final double CIRCLE_RADIUS = 5d;
    private static final double SQUARE_WIDE = 10d;
    private static final double RECTANGLE_WIDTH = 2d;
    private static final double RECTANGLE_HEIGHT = 4d;
    // Aproximated data
    private static final double TRIANGLE_BASE_1 = 5d;
    private static final double TRIANGLE_WIDE_1 = 6d;
    private static final double TRIANGLE_WIDE_2 = 6d;
    private static final double TRIANGLE_H = 4d;

    private WorkWithShapes() { }

    public static void main(final String[] args) {
        final Shapes circle = new Circle(CIRCLE_RADIUS);
        final Polygon square = new Square(SQUARE_WIDE);
        final Polygon rectangle = new Rectangle(RECTANGLE_WIDTH, RECTANGLE_HEIGHT);
        final Polygon triangle = new Triangle(TRIANGLE_BASE_1, TRIANGLE_WIDE_1, TRIANGLE_WIDE_2, TRIANGLE_H);
        
        System.out.println(circle.toString());
        System.out.println(square.toString());
        System.out.println(rectangle.toString());
        System.out.println(triangle.toString());
    }
}
