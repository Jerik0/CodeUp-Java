package InputStuff;

import java.io.PrintStream;

public class InputTest {


    public static void main(String[] args) {

        String separator = "================================";
        Input testie = new Input();
        PrintStream print = System.out;

        print.println(testie.yesNo());
        print.println(separator);
        print.println(testie.getString());
        print.println(separator);
        print.println("Thanks! I got " + testie.getInt());
        print.println(separator);
        print.println("Thanks! You entered: " + testie.getInt());
        print.println(separator);
        print.println("Thanks! You entered: " + testie.getDouble());
        print.println("*/*/*/*/*/Thanks for playing!*/*/*/*/*/");

    }
}
