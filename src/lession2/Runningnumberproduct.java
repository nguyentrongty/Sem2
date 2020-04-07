package lession2;

public class Runningnumberproduct {
    public static void main(String[] args) {
        int lowerbound = 1 ;
        int upperbound = 10;
        int product = 1;
        int number = lowerbound;
        while (number <= upperbound){
            product = product*number;
            ++number;
        }
        System.out.println("The product from "+ lowerbound + " to " + upperbound + " is " + product);
    }
}
