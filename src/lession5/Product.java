package lession5;

public class Product {
    public static void main(String[] args) {
        int lowerBound = 1;
        int upperbound = 15;
        int number = lowerBound;
        long product = 1;

        while (number <= upperbound){
            product = product * number;
            ++number;
        }
        System.out.println(product);
    }
}
