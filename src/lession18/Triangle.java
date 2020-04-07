package lession18;

public class Triangle extends Shape {

    //private member variable.
    private int base, height;

    //Constructor a triangle instance with the given color, base, height.
    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    //Return a self-descriptive string.
    public String toString() {
        return "Triangle[base = " + base + " height = " + height + "," + super.toString() + "]";
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}
