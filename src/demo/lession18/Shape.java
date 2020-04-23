package lession18;

public class Shape {
    //private member variable.
    private String color;

    //Constructor a shape instance with the given color.
    public Shape(String color) {
        this.color = color;
    }
    //Return a self-descriptive String.
    @Override
    public String toString() {
        return "Shape[color = " + color + "]";
    }
    public double getArea() {
        System.err.println("Shape unknown! Cannot compute area!");
        return 0;
    }
}
