package demo.lession2;

public class CylinderComputation {
    public static void main(String[] args) {
        double radius, height, suFaceArea, baseArea, volume;
        double PI = 3.14159265;
        radius = 2;
        height = 4;
        suFaceArea = 2*PI*radius*height;
        baseArea = 2*PI*radius*radius + 2*PI*radius*height;
        volume = PI*radius*radius*height;
        System.out.print("The suFaceArea is : ");
        System.out.println(suFaceArea);
        System.out.print("The baseArea is : ");
        System.out.println(baseArea);
        System.out.print("The volume is : ");
        System.out.println(volume);
    }
}
