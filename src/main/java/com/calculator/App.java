package com.calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator!");
        System.out.println("Choose an operation: add, subtract, multiply, divide");
        String operation = scanner.nextLine();

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();*/
String operation = "add";
        double num1=20,num2=10;
        double result = 0;
        switch (operation) {
            case "add":
                result = add(num1, num2);
                break;
            case "subtract":
                result = subtract(num1, num2);
                break;
            case "multiply":
                result = multiply(num1, num2);
                break;
            case "divide":
                if (num2 != 0) {
                    result = divide(num1, num2);
                } else {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }

        System.out.println("Result: " + result);
    }

    // Methods for arithmetic operations
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }
}
