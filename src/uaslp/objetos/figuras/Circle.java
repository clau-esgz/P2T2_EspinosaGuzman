package uaslp.objetos.figuras;

import uaslp.objetos.figuras.uaslp.objetos.Shape;

import java.awt.*;

public class Circle extends Shape {

    private double radio;
    public double getArea(){
        return Math.PI*radio*radio;
    }

    public double getPerimeter(){
        return Math.PI*radio*2;
    }

    public int getSidesCount(){
        return 0;
    }
    public Circle(){
        super("Circulo","");
    }
    public Circle(double radio){
        this();
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String draw(){
        return"○";
    }

}
