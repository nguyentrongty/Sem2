package lession3;

public class Relationallogica10pTest {
    public static void main(String[] args) {
        int age = 15 ;
        double weight = 71.23 ;
        int height = 191 ;
        boolean married = false ;
        boolean attached = false ;
        char gender = 'm' ;

        System.out.println(!married && !attached && (gender == 'm'));
        // true && true && true = true
        System.out.println(married && (gender == 'f'));
        // false && false = false
        System.out.println((height >= 180) && (weight >= 65) && (weight <= 80));
        // true && true && true = true
        System.out.println((height >= 180) || (weight >= 90));
        // true || false = true
    }
}
