package lession22;

import java.util.Arrays;
import java.util.Scanner;

public class ex2_1 {

    public static void main(String[] args) {
        int numberDay;
        int[] tNumberDay;
        int sum = 0;
        double tMedium = 0;
        int count = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number days : ");
        numberDay = in.nextInt();

        tNumberDay = new int[numberDay];
        for (int i = 0; i < tNumberDay.length; ++i) {
            System.out.print("t day " + (i + 1) + ": ");
            tNumberDay[i] = in.nextInt();
            sum += tNumberDay[i];
            tMedium = (double)sum/numberDay;
        }
        System.out.println(Arrays.toString(tNumberDay));
        System.out.println("Nhiet do Trung binh " + numberDay + " ngay la : " + tMedium);

        for (int j = 0; j < tNumberDay.length; ++j) {
            if (tMedium < tNumberDay[j]) {
                count += 1;
            }
        }
        System.out.println("Co "+ count + " ngay nhiet do cao hon trung binh");

    }
}