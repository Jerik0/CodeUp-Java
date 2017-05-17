package Circle;

import InputStuff.Input;
import java.io.PrintStream;

public class CircleApp {

   static Input userInput = new Input();

    public static void main(String[] args) {

    PrintStream print = System.out;
        print.println("Please enter a number to set the radius of the circle!");
        Circle circle1 = new Circle(userInput.getDouble());
        print.printf("%s %.2f \n", "The area for the circle is: ", circle1.getArea());
        print.printf("%s %.2f", "And the circumference of the circle is: ", circle1.getCircumference());

    }

}
