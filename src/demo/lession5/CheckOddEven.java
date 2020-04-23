package demo.lession5;

public class CheckOddEven {
    public static void main(String[] args) {
        int number = 42;
        System.out.println("The number is : "+ number);

        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        System.out.println("Bye!");
    }
}
