package demo.lession2;

public class Runningnumbersquaresum {
    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 100;
        int sum = 0;
        int number = lowerbound;
        while (number <= upperbound){
            sum = sum + number*number;
            ++number;
        }
        System.out.println("The sum square from "+ lowerbound + " to " + upperbound + " is " + sum);
    }
}
