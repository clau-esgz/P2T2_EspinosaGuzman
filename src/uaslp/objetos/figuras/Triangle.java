package uaslp.objetos.figuras;

import uaslp.objetos.figuras.uaslp.objetos.Shape;

public class Triangle extends Shape {

    private double height;
    private double base;

    private double sideA;
    private double sideB;
    private double sideC;
    public Triangle() {
        super("Triangulo");
    }
    public Triangle (double base, double height)
    {
        this();
        this.base = base;
        this.height = height;

    }
    public double getArea() {
        return base * height/2;
    }

    public double getPerimeter() {
       sideA = base /2;
       sideB = Math.sqrt((sideA*sideA)+(height*height));
       sideC = sideB;
       return sideA+sideB+sideC;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public int getSidesCount(){
        return 3;
    }
    public String draw(){
        return"▲";
    }


}
