package InputStuff;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        String input;
        System.out.println("Gimme a sentence or a word!");
        input = scanner.nextLine();
        return input;
    }

    public boolean yesNo() {
        System.out.println("Please enter yes or no");
        String input = scanner.nextLine();
        if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            return true;
        }
        return false;
    }

    public int getInt() {
        int min = 0;
        int max = 10;

        int input;
        System.out.println("Please enter a whole number!");
        input = scanner.nextInt();

        if (input > min && input <= max) {
            return (input);
        } else {
            getInt();
        }
        return 0;
    }

    public double getDouble() {
        double min = 0;
        double max = 10;
        double input;
        input = scanner.nextDouble();

        if (input > min && input <= max) {
            return (input);
        } else {
            getInt();
        }
        return 0;
    }

}


