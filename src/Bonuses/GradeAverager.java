package Bonuses;

import java.util.Scanner;
import java.util.stream.*;

public class GradeAverager {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int i=0;


        //Prompts user for input, defining how many grades will go into array 'arrayGrades'.
        System.out.println("Please enter the amount of grades that you'd like averaged.");
        int arraySize = scan.nextInt();

        //Assigns the array 'arrayGrades'.
        int[] arrayGrades;


        //Feeds user input to be the size of the array.
        arrayGrades = new int[arraySize];


        System.out.println("Here are all the grades!");

        //For loop that iterates from the value of i (0), to the last of the amount of grades that were specified by the user.
        for (i=0; i<arraySize; i++) {

            //Variable that represents x amount of grades from 0-100.
            int rando = (int) Math.floor(Math.random() * 99);

            //This adds a randomly generated number from 0-100 into the array 'arrayGrades'.
            arrayGrades[i] = rando;

            //This simply prints the results from each generated number, once for every iteration.
            System.out.println(arrayGrades[i]);

        }

        int sum = IntStream.of(arrayGrades).sum();

        scan.nextLine();
        System.out.println("Type Y to see the average, or N to quit.");
        String cont = scan.nextLine();

        if (cont.equalsIgnoreCase("y")) {
            System.out.println("The average is: " + (sum / arraySize));
        }

        //Sets the variable 'min' equal to the first index in the array 'arrayGrades'.
        int min = arrayGrades[0];

        //loops through the whole array 'arrayGrades'.
        for(i=1; i<arrayGrades.length; i++) {

            //if the current index of arrayGrades is less than the value of the 1st index,
            if (arrayGrades[i] < min) {
                //sets min equal to the lowest index in arrayGrades.
                min = arrayGrades[i];
            }
        }

        System.out.println("Type Y to see the lowest grade, or N to quit.");
        String cont2 = scan.nextLine();

        if (cont2.equalsIgnoreCase("y")) {
            System.out.println("The lowest grade in class is: " + min);
        }

    }

}
