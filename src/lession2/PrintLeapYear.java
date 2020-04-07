package lession2;

public class PrintLeapYear {
    public static void main(String[] args) {
        int lowerbound = 999 ;
        int upperbound = 2010;
        int count = 0 ;
        int Leapyer ;
        int number = lowerbound;

        while (number <= upperbound){
            if ((number % 4 == 0) && (number % 100 != 0) || (number % 400 == 0)){
                count = count + 1 ;
                Leapyer = number ;
                System.out.println("The LeapYear is :" + Leapyer);
            }
            ++number;
        }
        System.out.println("The sum leapyear from " + lowerbound + " to " + upperbound + " is "+ count);
    }
}
