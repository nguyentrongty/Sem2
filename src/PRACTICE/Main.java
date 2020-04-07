package PRACTICE;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create two objects EmployeeFullTime and EmployeeParTime.
        EmployeeFullTime F1 = new EmployeeFullTime();
        EmployeeParTime P1 = new EmployeeParTime();

        // Ask user to Input base salary for each object
        float baseSalary_F1;
        float baseSalary_P1;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base Salary employee FullTime: ");
        baseSalary_F1 = input.nextFloat();
        F1.setBaseSalary(baseSalary_F1);

        System.out.print("Enter base Salary employee ParTime: ");
        baseSalary_P1 = input.nextFloat();
        P1.setBaseSalary(baseSalary_P1);

        //Print salary for each object.
        System.out.println("Print salary for employeeFullTime: " + F1.getSalary());
        System.out.println("Print salary for employeeParTime: " + P1.getSalary());
    }
}