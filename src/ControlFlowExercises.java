import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        //Loop Basics
        //Display Letter Grade based on numerical input

    Scanner scan = new Scanner(System.in);


    String cont;
        do {
    System.out.println("InputStuff a numerical grade, from 0-100, to see the Letter Grade associated with it.");
    int input = scan.nextInt();
        if (input <= 59) {
            System.out.println("The corresponding Letter Grade is: F");
        } else if (input <= 66) {
            System.out.println("The corresponding Letter Grade is: D");
        } else if (input <= 79) {
            System.out.println("The corresponding Letter Grade is: C");
        } else if (input <= 87) {
            System.out.println("The corresponding Letter Grade is: B");
        } else {
            System.out.println("The corresponding Letter Grade is: A");
        }
        scan.nextLine();
    System.out.println("Continue? Y/N");
        cont = scan.nextLine();
    } while (cont.equals("y"));


    }

}

