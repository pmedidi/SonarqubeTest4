package com.example.calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter second number:");
            double num2 = scanner.nextDouble();

            System.out.println("Enter an operator (+, -, *, /):");
            char operator = scanner.next().charAt(0);

            Operation operation;
            switch (operator) {
                case '+':
                    operation = new Addition();
                    break;
                case '-':
                    operation = new Subtraction();
                    break;
                case '*':
                    operation = new Multiplication();
                    break;
                case '/':
                    operation = new Division();
                    break;
                default:
                    System.out.println("Invalid operator!");
                    return;
            }

            double result = operation.performOperation(num1, num2);
            System.out.println("The result is: " + result);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

interface Operation {
    double performOperation(double a, double b);
}

class Addition implements Operation {
    @Override
    public double performOperation(double a, double b) {
        return a + b;
    }
}

class Subtraction implements Operation {
    @Override
    public double performOperation(double a, double b) {
        return a - b;
    }
}

class Multiplication implements Operation {
    @Override
    public double performOperation(double a, double b) {
        return a * b;
    }
}

class Division implements Operation {
    @Override
    public double performOperation(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }
}
