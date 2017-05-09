package ConsoleIO;

import java.util.Scanner;

public class Classroom {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the width of your classroom?");
        double width = scan.nextDouble();
        System.out.println("What is the length of your classroom? ");
        double length = scan.nextDouble();

        System.out.println("The Area of your classroom is: " + (width*length) + ".");
        System.out.println("The Perimeter of your classroom is: " + ((width*2) + (length*2)) + ".");
    }
}
