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

    //Validates that user input is in a certain range
    private static int getIntegers() {
        System.out.println("Type two numbers (between 1 and 10) to perform mathematical functions on.");
        int input1 = scan.nextInt();
        int input2 = scan.nextInt();
        return checker(input1, input2);
    }

    private static int checker(int input1, int input2) {
        if ((input1 < 1 || input1 > 10) || (input2 < 1 || input2 > 10)) {
            System.out.println("Invalid number!");
            return getIntegers();
        } else {
            System.out.println("Thanks! You chose " + input1 + " and " + input2 + ".");
            add(input1, input2);
            subtract(input1, input2);
            multiply(input1, input2);
            divide(input1, input2);
            modulus(input1, input2);
            return 1;
        }
    }

    private static int factorCheck() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Type a number (between 1 and 10) to find the factorial for.");
        int n = scan.nextInt();
        if (n < 1 || n > 10) {
            factorCheck();
        } else {
        factor(n);
        }
        return 0;
    }

    private static int factor(int n) {
        int result;
        if (n == 1) {
            return 1;
        }
        result = factor(n-1) * n;
        System.out.println(n + "!" + " = " + result);
        return result;
    }

    private static void diceSides() {
        System.out.println("Enter how many dice to roll: ");
        int dice = scan.nextInt();
        int count;
        System.out.println("Thanks! Now, enter how many sides you'd like your dice to have: ");
        int sides = scan.nextInt();
        System.out.println("Thanks!");
        System.out.println("-------------------------");
        for (count=0; count<dice; count++) {
            diceRoll(sides, count);
        }
        scan.nextLine();
        rollCheck();
    }

    private static int diceRoll(int sides, int count) {
        int rando = (int) (Math.random() * sides + 1);
        System.out.println("Die " + (count + 1) + ": " + rando);
        return 0;
    }

    private static void rollCheck() {
        System.out.println("Roll again? (Y/N)");
        String rollChoice = scan.nextLine();

        if (rollChoice.equalsIgnoreCase("Y")) {
            diceSides();
        } else {
            return;
        }
    }

    public static void main(String[] args) {


//        getIntegers();
//
//        factorCheck();

        diceSides();



    }
}
