package uaslp.objetos.figuras;

import uaslp.objetos.figuras.uaslp.objetos.Shape;

public class Rectangle extends Shape {

    private double base;
    private double height;
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public Rectangle(){
        super("Rectangulo");
    }
    public Rectangle (double base, double height){
        this();
        this.base = base;
        this.height = height;
    }
    public double getArea() {
        return base*height;
    }
    public double getPerimeter() {
        return base * 2 + height*2;
    }
    public int getSidesCount(){
        return 4;
    }
    public String draw(){
        return"█";
    }
}