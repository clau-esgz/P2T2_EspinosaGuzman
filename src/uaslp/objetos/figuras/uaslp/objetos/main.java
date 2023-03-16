package uaslp.objetos.figuras.uaslp.objetos;

import uaslp.objetos.figuras.Circle;
import uaslp.objetos.figuras.Rectangle;
import uaslp.objetos.figuras.Square;
import uaslp.objetos.figuras.Triangle;
import java.util.LinkedList;
import java.util.List;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>();


        shapes.add(new Square(10)); // providing side
        shapes.add(new Rectangle(10, 20)); // providing base and height
        shapes.add(new Triangle(10, 20)); // providing base and height
        shapes.add(new Circle(10)); // providing radio


        for(Shape shape: shapes){
            System.out.println("Shape: " + shape.getName() + ": " + shape.draw()); //with shape print something related to the actual shape, for example ○ ▲ ■ █
            System.out.println("Real class name: " + shape.getClass().getName());
            System.out.println("Sides count: " + shape.getSidesCount());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println("Area: " + shape.getArea());
            System.out.println("---------------------------------------");
        }

    }
}
