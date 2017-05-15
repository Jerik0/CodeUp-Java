package Methods;

import java.util.Scanner;

public class Arithmetic {

    private static Scanner scan = new Scanner(System.in);

    //Create four separate methods. Each will perform an arithmetic operation:

    //Adds two numbers.
    private static int add(int first, int second) {
        int result = (first + second);
        System.out.println("Added together: " + first + " + " + second + " = " + result);
        return result;
    }

    //Subtracts two numbers.
    private static int subtract(int first, int second) {
        int result = (first - second);
        System.out.println("Subtracted: " + first + " - " + second + " = " + result);
        return result;
    }

    //Multiplies two numbers.
    private static int multiply(int first, int second) {
        int result = (first * second);
        System.out.println("Multiplied: (" + first + " x " + second + ") = " + result);
        return result;
    }

    //Divides two numbers (if second number is not zero).
    private static double divide(double first, double second) {
        double result = (first / second);
        if (second != 0) {
            System.out.println("Divided: " + first + "/" + second + " = " + result);
        } else {
            System.out.println("We can't divide by zero, silly!");
        }
        return result;
    }

    //Finds the modulus of two numbers.
    private static int modulus(int first, int second) {
        int result = (first % second);
        if (second != 0) {
        System.out.println("Division Remainder (Modulus): " + first + " % " + second + " = " + result);
        } else {
            System.out.println("We can't divide by zero, silly!");
        }
        return result;
    }

    //Receives two numbers from user, filters through checker().
    private static int getIntegers() {
        System.out.println("Type two numbers (between 1 and 10) to perform mathematical functions on.");
        int input1 = scan.nextInt();
        int input2 = scan.nextInt();
        return checker(input1, input2);
    }

    //Validates that user input is in a certain range, and if it is, performs specified methods.
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

    //Receives user input and checks if it is in specified range. If in range, calls factor().
    private static int factorCheck() {
        System.out.println("Type a number (between 1 and 10) to find the factorial for.");
        int n = scan.nextInt();
        if (n < 1 || n > 10) {
            factorCheck();
        } else {
        factor(n);
        }
        return 0;
    }

    //Performs a factorial of received number, and all numbers before it (until 1 is reached).
    private static int factor(int n) {
        int result;
        if (n == 1) {
            return 1;
        }
        result = factor(n-1) * n;
        System.out.println(n + "!" + " = " + result);
        return result;
    }

    //Receives user Input for how many dice, and how many sides for the dice to have.
    private static void diceSides() {
        System.out.println("Enter how many dice to roll: ");
        int dice = scan.nextInt();
        int count;
        System.out.println("Thanks! Now, enter how many sides you'd like your dice to have: ");
        int sides = scan.nextInt();
        System.out.println("Thanks!");
        System.out.println("-------------------------------");
        for (count=0; count<dice; count++) {
            diceRoll(sides, count);
        }
        rollCheck();
    }

    //Randomly generates a number for each die based on the sides and die amount previously defined.
    private static int diceRoll(int sides, int count) {
        int rando = (int) (Math.random() * sides + 1);
        System.out.println("Die " + (count + 1) + ": " + rando);
        return 0;
    }

    //Checks if user wants to continue. If so, calls diceSides() again.
    private static void rollCheck() {
        System.out.println("Roll again? (Y/N)");
        String rollChoice = scan.next();

        if (rollChoice.equalsIgnoreCase("Y")) {
            diceSides();
        } else {
            return;
        }
    }

    //Generates random number (1-100) and calls guess()
    private static void generate() {
        int randomNum = (int) (Math.random() * 100 + 1);
        System.out.println("Guess which number I picked! Hint: (it's between 1 and 100)");
        guess(randomNum);
    }

    private static void guess(int random) {
        int guess = scan.nextInt();
        guessCheck(guess, random);
    }

    private static void guessCheck(int guess, int rando) {
        if (guess == rando) {
            System.out.println("-------------------------------");
            System.out.println("Good Guess! Thanks for playing!");
            System.out.println("-------------------------------");
        } else if (guess < rando) {
            System.out.println("Higher...");
            guess(rando);
        } else if (guess > rando) {
            System.out.println("Lower...");
            guess(rando);
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Jeriko's Mini Games!");
        System.out.println("-------------------------------");

        getIntegers();
        System.out.println("-------------------------------");
        factorCheck();
        System.out.println("-------------------------------");
        diceSides();
        System.out.println("-------------------------------");
        generate();

    }
}
