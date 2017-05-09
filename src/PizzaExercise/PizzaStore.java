package PizzaExercise;

import java.io.PrintStream;
import java.util.Scanner;

public class PizzaStore {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        PrintStream output = System.out;

        output.println("Pizza Sizes: Small - $5.00. Medium - $8.00. Large - $11.00.");

        output.println(" Please type a size:");

        String userSize = scan.nextLine();

        output.println("Thank you! Now please choose a type:");
        output.println("Pepperoni");
        output.println("Cheese");
        output.println("Supreme");
        output.println("Veggie");
        output.println("Vegan");
        output.println("Meat Lovers");

        String userType = scan.nextLine();

        output.println("So far you have chosen a " + userSize + ", " + userType + " pizza.");

        output.println("Extra sides - $1.50 each:");
        output.println("Avocado");
        output.println("Extra Cheese");
        output.println("Sausage");
        output.println("Pineapple");
        output.println("Extra Pepperoni");
        output.println("Choose any sides that you would like. If none desired, type 'none'");

    }
}
