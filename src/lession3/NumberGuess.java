package lession3;

import java.util.Scanner;
public class NumberGuess {
    public static void main(String[] args) {
        int secretNumber;
        int numberIn;
        int trialNumber = 0;
        boolean done = false;
        Scanner in = new Scanner(System.in);

        secretNumber = (int)(Math.random()*100);

        while (!done){
            ++trialNumber;
            System.out.print("Enter your guess (between 1 and99): ");
            numberIn = in.nextInt();
            if (numberIn == secretNumber) {
                System.out.println("congratulation");
                done = true;
            }else if (numberIn < secretNumber) {
                System.out.println("Try lower");
            }
        }
        System.out.println("you got in " + trialNumber + "trials");
        in.close();
    }
}
