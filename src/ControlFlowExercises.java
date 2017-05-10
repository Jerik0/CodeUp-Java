import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        //Loop Basics
        //Display Squared and Cubed Table

    Scanner scan = new Scanner(System.in);

    System.out.println("Choose a number, 127 or lower, to be squared and cubed.");
    int input = scan.nextInt();
    int i;

    System.out.println("Here is your table for number " + input + "!");
    System.out.println("Number | Squared | Cubed");
    System.out.println("------ | ------- | -----");
    for(i = 1; i<=input; i++) {

        System.out.println(i + "      | " + (i*i) + "       | " + (i*i*i) + "     ");
    }

    }

}

