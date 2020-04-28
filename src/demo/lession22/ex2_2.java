package demo.lession22;

import java.util.Arrays;
import java.util.Scanner;

public class ex2_2 {

    public static void main(String[] args) {
        int size;
        int[] array;
        int sum = 0;
        double Average = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        size = in.nextInt();

        array = new int[size];
        for (int i = 0; i < array.length; ++i) {
            System.out.print("Number " + (i + 1) + " : ");
            array[i] = in.nextInt();
            sum += array[i];
            Average = (double)sum/size;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Average of array is : " + Average);
    }
}
