package ConsoleIO;

import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Type your age:");
        int age = scan.nextInt();
        System.out.println("Your age is: " + age);

        System.out.println("Type three words: ");
        String word1 = scan.next();
        String word2 = scan.next();
        String word3 = scan.nextLine();
        System.out.println("Your first word was: " + word1);
        System.out.println("Your second word was: " + word2);
        System.out.println("Your third word was: " + word3);

        System.out.println("Type a sentence: ");
        String sentence = scan.nextLine();
        System.out.println(sentence);

    }
}
