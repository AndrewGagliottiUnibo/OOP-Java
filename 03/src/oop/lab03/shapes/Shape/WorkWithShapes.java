package oop.lab03.shapes.Shape;

import oop.lab03.shapes.interfaces.Shape.IPolygon;

public class WorkWithShapes {

    public static void main(String[] args) {
        
        //istanzio oggetti
        IPolygon rectangle = new Rectangle(10, 20);
        IPolygon triangle = new Triangle(10, 20);
        IPolygon square = new Square(10);
        
        //stampa dei dati relativi
        System.out.println("Perimetro rettangolo: " + rectangle.perimeterCalculator());
        System.out.println("Area rettangolo: " + rectangle.areaCalculator());
        System.out.println("Lati: " + rectangle.getEdgeCount());
        System.out.println("\nPerimetro triangolo: " + triangle.perimeterCalculator());
        System.out.println("Area triangolo: " + triangle.areaCalculator());
        System.out.println("Lati: " + triangle.getEdgeCount());
        System.out.println("\nPerimetro quadrato" + square.perimeterCalculator());
        System.out.println("Area quadrato: " + square.areaCalculator());
        System.out.println("Lati: " + square.getEdgeCount());
    }

}
