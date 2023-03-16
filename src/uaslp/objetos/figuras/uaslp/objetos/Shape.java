package uaslp.objetos.figuras.uaslp.objetos;

public abstract class Shape {

    private String name;

    private int sidesCount;

    public Shape( String name){
        this.name = name;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public abstract int getSidesCount();

    public abstract String draw();



}
