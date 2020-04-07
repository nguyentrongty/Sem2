package lession5;

public class SumAverageRuningInt {
    public static void main(String[] args) {
        int lowerBound = 1;
        int upperBound = 100;
        int sum = 0, count = 0;
        double average;

        for (int number = lowerBound; number <= upperBound; ++number) {
            ++count;
            sum += number;
        }
        average = (double)sum/count;
        System.out.println("The sum is :"+ sum);
        System.out.println("The average is :" + average);

    }
}
