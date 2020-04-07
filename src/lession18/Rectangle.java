package lession18;

public class Rectangle extends Shape {

    //private member variable.
    private int length, width;

    //constructor a rectangle instance with the given color, length, width.
    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    //Return a self-descriptive string.
    public String toString() {
        return "Rectangle[length= " + length + ", width = " + width + "," + super.toString() + "]";
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
