package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static void main(String[] args) {
        // Starting of calculator work....
        logger.info("Starting the Calculator Application.");
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        // Performing the tasks...
        do {
            logger.info("Showing the options to the user.");
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
                logger.info("User's choice is: " + choice);
            } catch (InputMismatchException exception) {
                logger.error("Exception while taking input from user: " + exception.getLocalizedMessage());
                System.err.println(exception.getLocalizedMessage());
                return;
            }

            double operand1 = 0.0, operand2 = 0.0;
            switch (choice) {
                case 1:
                    // Case 1 -> Square root function
                    logger.info("Using square root function...");
                    System.out.print("\nEnter the Number: ");
                    try {
                        operand1 = scanner.nextDouble();
                        if (operand1 <= 0) {
                            System.err.println("Square root of non-positive number is not applicable.");
                            logger.error("Non-Positive number added by the user for square root function.");
                        } else {
                            logger.info("User's input for square root: " + operand1);
                            System.out.println("\nSquare root of " + operand1 + " is: " + calculator.squareRoot(operand1));
                        }
                    } catch (InputMismatchException exception) {
                        logger.error("Exception while taking input: " + exception.getLocalizedMessage());
                        System.err.println(exception.getLocalizedMessage());
                    }
                    break;
                case 2:
                    // Case 2 -> Factorial Function
                    logger.info("Using the factorial function...");
                    System.out.print("\nEnter a Number: ");
                    try {
                        operand1 = scanner.nextDouble();
                        if (operand1 < 0) {
                            System.err.println("Factorial of negative number is not applicable.");
                            logger.error("Negative number given by the user for factorial function.");
                        } else {
                            logger.info("User's input for factorial: " + operand1);
                            System.out.println("\nFactorial of " + operand1 + " is: " + calculator.factorial(operand1));
                        }
                    } catch (InputMismatchException exception) {
                        logger.error("Exception while taking input: " + exception.getLocalizedMessage());
                        System.err.println(exception.getLocalizedMessage());
                    }
                    break;
                case 3:
                    // Case 3 -> Natural log function
                    logger.info("Using the natural log function...");
                    System.out.print("\nEnter a Number: ");
                    try {
                        operand1 = scanner.nextDouble();
                        if (operand1 <= 0) {
                            System.err.println("Natural log is only applicable for positive numbers.");
                            logger.error("Non-positive number entered by user for natural log.");
                        } else {
                            logger.info("User's input for natural log function: " + operand1);
                            System.out.println("\nNatural log of " + operand1 + " is: " + calculator.naturalLog(operand1));
                        }
                    } catch (InputMismatchException exception) {
                        logger.error("Exception while taking input: " + exception.getLocalizedMessage());
                        System.err.println(exception.getLocalizedMessage());
                    }
                    break;
                case 4:
                    // Case 4 -> Subtraction Case
                    logger.info("Using the power function...");
                    try {
                        System.out.print("\nEnter the Number: ");
                        operand1 = scanner.nextDouble();
                        logger.info("User's input for number: " + operand1);
                        System.out.print("\nEnter the Power: ");
                        operand2 = scanner.nextDouble();
                        logger.info("User's input for power: " + operand2);
                        if (operand1 <= 0 || operand2 < 0) {
                            System.err.println("Number and Power input should be non-negative.");
                            logger.error("Negative input given by the user for power function.");
                        } else {
                            System.out.println("\n" + operand1 + " power " + operand2 + " is: " + calculator.power(operand1, operand2));
                        }
                    } catch (InputMismatchException exception) {
                        logger.error("Exception while taking input: " + exception.getLocalizedMessage());
                        System.err.println(exception.getLocalizedMessage());
                    }
                    break;
                default:
                    logger.fatal("User is exiting the calculator application.");
                    System.out.println("Exiting the Calculator!!!!!");
                    return;
            }
        } while (true);
    }

    /***
     * This function calculates the power of a number.
     * @param operand1 -> is the number that is given by the user.
     * @param operand2 -> is the power that is to be calculated.
     * @return -> (operand1 ^ operand2).
     */
    public double power(double operand1, double operand2) {
        logger.info("Calculating " + operand1 + "^" + operand2 + ".");
        double res = Math.pow(operand1, operand2);
        logger.info("Result: " + operand1 + "^" + operand2 + " = " + res + ".");
        return res;
    }

    /***
     * This function calculates natural log (base e) of given number.
     * @param operand -> Input number given by the user.
     * @return -> the natural log of the given number.
     */
    public double naturalLog(double operand) {
        logger.info("Calculating log(" + operand + ").");
        double res = Math.log(operand);
        logger.info("Result: log(" + operand + ") = " + res + ".");
        return res;
    }

    /***
     * This function calculates factorial of a given number.
     * @param operand -> a number provided by the user.
     * @return -> factorial of the provided number by the user.
     */
    public double factorial(double operand) {
        logger.info("Calculating " + operand + "! [! mean factorial].");
        double res = 1;
        for (int i = 1; i <= (int) operand; i++) {
            res *= i;
        }
        logger.info("Result: " + operand + "! = " + res + ".");
        return res;
    }

    /***
     * This function calculates square root of a given number.
     * @param operand -> an input given by the user.
     * @return -> square root of the number provided by the user.
     */
    public double squareRoot(double operand) {
        logger.info("Calculating square root of " + operand + ".");
        double res = Math.sqrt(operand);
        logger.info("Result: " + operand + "^0.5 = " + res + ".");
        return res;
    }
}
