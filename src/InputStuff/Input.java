package InputStuff;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {

        this.scanner = new Scanner(System.in);

    }

    public String getString() {

        return "this is a string yay";
    }

    public boolean yesNo(String input) {

        if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            return true;
        }

        return false;
    }

    public int getInt(int min, int max) {

        return 0;
    }

    public int getInt() {

        return 0;
    }

    public double getDouble(double min, double max) {

        return 0;
    }

    public double getDouble() {

        return 0;
    }

}


