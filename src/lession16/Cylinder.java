package lession16;

public class Cylinder extends Circle{

    private double height;

    //Constructor.
    public Cylinder() {
        super(); //invoke superclass constructor Circle
        this.height = 1.0;
        System.out.println("constructed a Cylinder with cylinder()");
    }
    public Cylinder(double height) {
        super();
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height)");
    }
    public Cylinder(double height, double radius) {
        super();
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius)");
    }
    public Cylinder(double height, double radius, String color) {
        super();
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius, color)");
    }
    //getters and setter.
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    //Return the volume of Cylinder
    @Override
    public double getArea() {
        return 2*Math.PI*getRadius()*height + 2*super.getArea();
    }
    public double getVolume() {
        return super.getArea()*height;
    }
    public String toString() {
        return "this is a Cylinder";
    }

}
