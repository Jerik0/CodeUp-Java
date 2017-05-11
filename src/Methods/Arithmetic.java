package Methods;

import java.util.Scanner;

public class Arithmetic {

    public static int add(int first, int second) {
        int result = (first + second);
        return result;
    }

    public static int subtract(int first, int second) {
        int result = (first - second);
        return result;
    }

    public static int multiply(int first, int second) {
        int result = (first * second);
        return result;
    }

    public static double divide(double first, double second) {
        double result = (first / second);
            return result;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Type the two numbers (without commas) to perform mathematical functions on: ");
        int Number1 = scan.nextInt();
        int Number2 = scan.nextInt();

        System.out.println("Added together: " + Number1 + " + " + Number2 + " = " + add(Number1, Number2));
        System.out.println("Subtracted: " + Number1 + " - " + Number2 + " = " + subtract(Number1, Number2));
        System.out.println("Multiplied: (" + Number1 + " x " + Number2 + ") = " + multiply(Number1, Number2));
        if (Number2 != 0) {
        System.out.println("Divided: " + Number1 + "/" + Number2 + " = " + divide(Number1, Number2));
        } else {
            System.out.println("We can't divide by zero, silly!");
        }


    }
}
