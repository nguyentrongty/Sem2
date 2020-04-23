package demo.lession3;

public class ex3_6 {
    public static void main(String[] args) {
        char operator = '*' ;
        int num1 = 5, num2 = 8, result ;
        switch (operator) {
            case '+':
                result = num1 + num2; break;
            case '-':
                result = num1 - num2; break;
            case '*':
                result = num1 * num2; break;
            case '/':
                result = num1 / num2; break;
            default:
                System.out.println("Unknown operator");
        }
    }
}
