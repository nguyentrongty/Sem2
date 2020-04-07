package lession2;

public class RunningNumberMod7Sum {
    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 1000;
        int sum = 0;
        int number = 7;
        while (number <= upperbound){
            sum = sum + number;
            number = number + 7;
        }
        System.out.println("The sum numbermod7 from "+ lowerbound + " to " + upperbound + " is " + sum);
    }
}
