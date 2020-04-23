package demo.lession3;

public class Average1Top100 {
    public static void main(String[] args) {
        int sum = 1 ;
        double average ;
        for (int number = 1 ; number <= 100 ; ++ number){
            sum += number;
        }
        average = sum/100;
        System.out.println("average is : "+ average);
    }
}
