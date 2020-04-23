package demo.lession3;

import java.util.Scanner;
public class ScannerNextLineTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string (with space): ");

        String tr = in.nextLine();
        System.out.printf("%s%n", tr);
        in.close();
    }
}
