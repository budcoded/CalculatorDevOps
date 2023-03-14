package org.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("***** CALCULATOR DEVOPS *****");
            System.out.println("Operations:");
            System.out.println("1 -> Square Root");
            System.out.println("2 -> Factorial");
            System.out.println("3 -> Natural Log (base e)");
            System.out.println("4 -> Power");
            System.out.println("Press any other key for Exit.");
            System.out.print("Please Enter Your Choice: ");

            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException exception) {
                System.err.println(exception.getLocalizedMessage());
                return;
            }

            switch (choice) {
                case 1:
                    // Case 1 -> Square root function
                    System.out.print("\nEnter the Number: ");
                    double val = scanner.nextDouble();

                    System.out.println("\nSquare root of " + val + " is: " + calculator.squareRoot(val));
                    break;
                case 2:
                    // Case 2 -> Factorial Function
                    System.out.print("\nEnter a Number: ");
                    double factVal = scanner.nextDouble();
                    System.out.println("\nFactorial of " + factVal + " is: " + calculator.factorial(factVal));
                    break;
                case 3:
                    // Case 3 -> Natural log function
                    System.out.print("\nEnter a Number: ");
                    double log = scanner.nextDouble();
                    System.out.println("\nNatural log of " + log + " is: " + calculator.naturalLog(log));
                    break;
                case 4:
                    // Subtraction Case
                    System.out.print("\nEnter the Number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("\nEnter the Power: ");
                    double num2 = scanner.nextDouble();

                    System.out.println("\n" + num1 + " power " + num2 + " is: " + calculator.power(num1, num2));
                    break;
                default:
                    System.out.println("Exiting the Calculator!!!!!");
                    return;
            }
        } while (true);
    }

    public double power(double num1, double num2) {
        double res = Math.pow(num1, num2);
        return res;
    }

    public double naturalLog(double log) {
        double res = Math.log(log);
        return res;
    }

    public double factorial(double factVal) {
        double res = 1;
        for (int i = 1; i <= (int) factVal; i++) {
            res *= i;
        }
        return res;
    }

    public double squareRoot(double val) {
        double res = Math.sqrt(val);
        return res;
    }
}
