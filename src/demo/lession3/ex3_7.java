package demo.lession3;

public class ex3_7 {
    public static void main(String[] args) {
        int sum = 0;
        int lowerBound = 1;
        int upperbound = 1000;
        double average ;
        for (int number = lowerBound; number <= upperbound; ++number){
            sum += number;
        }
        average = (double)sum/(upperbound - lowerBound + 1);
        System.out.println("The sum from "+ lowerBound + " to " + upperbound + " is :" + sum);
        System.out.println("The average is :" + average);

        int count = 0, Sum = 0;
        if (lowerBound % 2 == 0){
            lowerBound++;
        }
        for (int number = lowerBound; number <= upperbound; number +=2){
            ++count;
            Sum += number;
        }
        average = (double)Sum /count;
        System.out.println("The sum off odd number is :" + Sum);
        System.out.println("The average odd number is :" + average);
    }
}
