package demo.lession4;

import java.util.Scanner;
import java.util.Arrays;
public class GradesHistograms {
    public static void main(String[] args) {
        //declare variables
        int numberStudents;
        int[] grades;
        int[] bins = new int[10];
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        numberStudents = in.nextInt();

        grades = new int[numberStudents];
        for (int i = 0; i < grades.length; ++i) {
            System.out.print("Enter the grade of student " + (i + 1) + ": ");
            grades[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(grades));

        for (int grade : grades) {
            if (grade == 100) {
                ++bins[9];
            }else {
                ++bins[grade/10];
            }
        }
        System.out.println(Arrays.toString(bins));

        for (int binTdx = 0; binTdx < bins.length; ++binTdx) {
            if (binTdx != 9) {
                System.out.printf("%2d-%3d : " , binTdx * 10, binTdx * 10 + 9);
            } else {
                System.out.printf("%2d-%3d : ", 90, 100);
            }
            for (int itemNo = 0; itemNo < bins[binTdx]; ++itemNo) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Find the max value among the bins
        int binMax = bins[0];
        for (int binIdx = 1; binIdx < bins.length; ++binIdx) {
            if (binMax < bins[binIdx]) binMax = bins[binIdx];
        }

        for (int level = binMax; level > 0; --level) {
            for (int binIdx = 0; binIdx < bins.length; ++binIdx) {
                if (bins[binIdx] >= level) {
                    System.out.print("   *   ");
                } else {
                    System.out.print("       ");
                }
            }
            System.out.println();
        }
        //Print label
        for (int binIdx = 0; binIdx < bins.length; ++binIdx) {
            System.out.printf("%3d-%-3d", binIdx * 10, (binIdx != 9) ? binIdx*10 + 9 : 100);
        }

        System.out.println();
        in.close();
    }
}
