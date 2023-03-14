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
                    int factVal = scanner.nextInt();
                    System.out.println("\nFactorial of " + factVal + " is: " + calculator.factorial(factVal));
                    break;
//                case 3:
//                    // Case 3 -> Natural log function
//                    System.out.print("\nEnter a Number: ");
//                    int  = scanner.nextDouble();
//                    System.out.println("\nSquare of " + number1 + " is: " + calculator.square(number1));
//                    break;
//                case 4:
//                    // Subtraction Case
//                    System.out.print("\nFirst Number: ");
//                    number1 = scanner.nextDouble();
//                    System.out.print("\nSecond Number: ");
//                    number2 = scanner.nextDouble();
//
//                    System.out.println("\nSubtraction of " + number2 + " from " + number1 + " is: " + calculator.subtraction(number1, number2));
//                    break;
                default:
                    System.out.println("Exiting the Calculator!!!!!");
                    return;
            }
        } while (true);
    }

    private int factorial(int factVal) {

        return factVal;
    }

    private double squareRoot(double val) {
        double res = Math.sqrt(val);
        return res;
    }

    public double subtraction(double number1, double number2) {
        double result = number1 - number2;
        return result;
    }

    public double square(double number1) {
        double result = number1 * number1;
        return result;
    }

    public double cubeRoot(double number1) {
        double result = Math.cbrt(number1);
        return result;
    }

    public double multiplication(double number1, double number2) {
        double result = number1 * number2;
        return result;
    }
}
