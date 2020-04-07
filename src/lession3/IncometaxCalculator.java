package lession3;

import java.util.Scanner;
public class IncometaxCalculator {
    public static void main(String[] args) {
        final double TAX_RATE_ABOVE_20K = 0.1;
        final double TAX_RATE_ABOVE_30K = 0.2;
        final double TAX_RATE_ABOVE_40K = 0.3;

        int taxableIncome;
        double taxPayable;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter taxable income: $");
        taxableIncome = in.nextInt();

        if (taxableIncome <= 20000){
            taxPayable = 0;
        }else if (taxableIncome <= 40000){
            taxPayable = (taxableIncome - 20000) * TAX_RATE_ABOVE_20K;
        }else if (taxableIncome <= 60000){
            taxPayable = (taxableIncome - 40000) * TAX_RATE_ABOVE_30K +
                    20000 * TAX_RATE_ABOVE_20K;
        }else {
            taxPayable = 20000 * TAX_RATE_ABOVE_20K + 20000 * TAX_RATE_ABOVE_30K +
                    (taxableIncome - 60000) * TAX_RATE_ABOVE_40K;
        }

        System.out.printf("The Income tax payable is : $%.2f%n", taxPayable);
        in.close();
    }
}
