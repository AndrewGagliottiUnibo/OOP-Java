package oop.lab03.shapes.Shape;

import oop.lab03.shapes.interfaces.Shape.IShape;

public class UseCircle {

    public static void main(String[] args) {
       
        IShape circle = new Circle(10);
        
        //calcolo
        System.out.println("Circle perimeter is: " + /*(float)*/ circle.perimeterCalculator());
        System.out.print("Circle area is: " + /*(float)*/ circle.areaCalculator());
    }

}
