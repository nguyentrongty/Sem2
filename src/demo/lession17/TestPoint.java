package lession17;

public class TestPoint {
    public static void main(String[] args) {

        Point p1 = new Point(10, 20);
        System.out.println(p1);

        p1.setX(100);
        p1.setY(10);
        System.out.println(p1);
        p1.setXY(200, 300);
        System.out.println(p1);
    }
}
