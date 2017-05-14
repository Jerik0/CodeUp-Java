package Methods;

import java.util.Scanner;

public class Arithmetic {

    private static Scanner scan = new Scanner(System.in);

    //Create four separate methods. Each will perform an arithmetic operation:
    private static int add(int first, int second) {
        int result = (first + second);
        System.out.println("Added together: " + first + " + " + second + " = " + result);
        return result;
    }

    private static int subtract(int first, int second) {
        int result = (first - second);
        System.out.println("Subtracted: " + first + " - " + second + " = " + result);
        return result;
    }

    private static int multiply(int first, int second) {
        int result = (first * second);
        System.out.println("Multiplied: (" + first + " x " + second + ") = " + result);
        return result;
    }

    private static double divide(double first, double second) {
        double result = (first / second);
        if (second != 0) {
            System.out.println("Divided: " + first + "/" + second + " = " + result);
        } else {
            System.out.println("We can't divide by zero, silly!");
        }
        return result;
    }

    //Add a modulus function that finds the modulus of two numbers.
    private static int modulus(int first, int second) {
        int result = (first % second);
        if (second != 0) {
        System.out.println("Division Remainder (Modulus): " + first + " % " + second + " = " + result);
        } else {
            System.out.println("We can't divide by zero, silly!");
        }
        return result;
    }

    //Create a method that validates that user input is in a certain range
    private static int getIntegers(int min, int max) {

        if (min < 1 && max > 10) {
            System.out.println("Invalid number, try again!");
            return getIntegers(min, max);
        } else {
            System.out.println("Thanks!");
            return 100;
        }
    }

    private static int factor(int n) {
        int result;
            if (n < 1 || n > 10) {
                System.out.println("Whoops that wasn't in the range!");
                return 1;
            } else {
                result = factor(n-1) * n;
                System.out.println(n + "!" + " = " + result);
                return result;
            }
        }

    public static void main(String[] args) {

        System.out.println("Type two numbers (between 1 and 10) to perform mathematical functions on.");
        int input1 = scan.nextInt();
        int input2 = scan.nextInt();
        getIntegers(input1, input2);
        add(input1, input2);
        subtract(input1, input2);
        multiply(input1, input2);
        divide(input1, input2);
        modulus(input1, input2);

        System.out.println("-----------------------------------------------------------");
        System.out.println("Type a number (between 1 and 10) to find the factorial for.");
        int a = scan.nextInt();
        factor(a);


    }
}
