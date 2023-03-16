package uaslp.objetos.figuras;

import uaslp.objetos.figuras.uaslp.objetos.Shape;

public class Square extends Shape {

    private double side;
    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return side*4;
    }

    public Square(){
        super("Cuadrado");
    }

    public Square(double side){
        this();
        this.side = side;
    }
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public int getSidesCount(){
        return 4;
    }

    public String draw(){
        return"■";
    }
}
