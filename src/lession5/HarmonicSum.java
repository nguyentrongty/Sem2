package lession5;

public class HarmonicSum {
    public static void main(String[] args) {
        int maxDenominator = 50000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;

        for (int denominator =1; denominator <= maxDenominator; ++denominator) {
            sumL2R += (double) 1/denominator;
            ++denominator;
        }
        System.out.println("The sum from left to right is :" + sumL2R);

        for (int denominator = 50000; denominator > 0; --denominator) {
            sumR2L += (double)1/denominator;
            --denominator;
        }
        System.out.println("The sum from right to left is :" + sumR2L);
    }
}
