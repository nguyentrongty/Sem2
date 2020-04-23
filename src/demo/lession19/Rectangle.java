package lession19;

public class Rectangle implements Shape {
    //private member variable.
    private int length, width;

    //Constructor a Rectangle instance with the given length and width.
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    //Return a self - descriptive string.
    @Override
    public String toString() {
        return "Rectangle[length = " + length + ", width " + width + "]";
    }
    @Override
    public double getArea() {
        return length * width;
    }
}
