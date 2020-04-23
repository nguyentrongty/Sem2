package demo.lession6;

public class TestCircle {
    public static void main(String[] args) {
        //Declare and Construct an instance of the Circle class called c1
        Circle c1 = new Circle(2.0, "blue");
        System.out.println("The radius is :" + c1.getRadius());
        System.out.println("The color is :" + c1.getColor());
        System.out.println("The area is : " + c1.getArea());

        //Declare and Construct an instance of Circle class called c2
        Circle c2 = new Circle(2.0);
        System.out.println("The radius is :" + c2.getRadius());
        System.out.println("The color is : " + c2.getColor());
        System.out.println("The area is : " + c2.getArea());

        //Declare and Construct an instance Circle class called c3
        Circle c3 = new Circle();
        System.out.println("the radius is : " + c3.getRadius());
        System.out.println("The color is : " + c3.getColor());
        System.out.println("The area is : " + c3.getArea());
    }
}
