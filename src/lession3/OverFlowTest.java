package lession3;

public class OverFlowTest {
    public static void main(String[] args) {
        int i = 2147483647 ;
        System.out.println(i + 1);
        System.out.println(i + 2);
        System.out.println(i + 3);
        System.out.println(i * 2);
        System.out.println(i * i);

        int i2 = -2147483648 ;
        System.out.println(i2 - 1);
        System.out.println(i2 - 2);
        System.out.println(i2 * i2);
    }
}
