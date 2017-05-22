package Collections;

import java.util.*;
import InputStuff.Input;

public class GradesApplication {

    public static Map<String, Student> gitMatch = new HashMap<>();
    public static Input listener = new Input();

    public static void gitPrint() {
        System.out.println("These are the github usernames of our students:\n");
        gitMatch.forEach((gitName, student) -> {
            System.out.print(" |" + gitName + "| ");
        });
    }

    public static void userPrompt() {
        System.out.println("\nWhat student would you like more information on?");
        System.out.println("              (Type your answer)");
        String studentChoice = listener.getString();
        if (gitMatch.containsKey(studentChoice)) {
            double studentAvg = gitMatch.get(studentChoice).getGradeAverage();
            String studentName = gitMatch.get(studentChoice).getName();
            System.out.println("Name: " + studentName);
            System.out.println("Current Average: " + studentAvg);
            System.out.println("Would you like to continue? Y/N");
            String exit = listener.getString();
            if (exit.equalsIgnoreCase("y")) {
                gitPrint();
                userPrompt();
            } else {System.exit(0);}
        } else {
            System.out.println("Whoops, that's not a valid entry! Try again...");
            userPrompt();
        }
    }

    public static void main(String[] args) {



        Student Jonathan = new Student("Jonathan");
        Student Mike = new Student("Mike");
        Student Jaime = new Student("Jaime");
        Student Dusty = new Student("Dusty");

        Jonathan.addGrade(93);
        Jonathan.addGrade(90);
        Jonathan.addGrade(83);
        Jonathan.addGrade(75);

        Mike.addGrade(89);
        Mike.addGrade(98);
        Mike.addGrade(91);
        Mike.addGrade(82);

        Jaime.addGrade(77);
        Jaime.addGrade(100);
        Jaime.addGrade(94);
        Jaime.addGrade(91);

        Dusty.addGrade(99);
        Dusty.addGrade(87);
        Dusty.addGrade(80);
        Dusty.addGrade(100);

        gitMatch.put("Jerik0", Jonathan);
        gitMatch.put("BossMike", Mike);
        gitMatch.put("JMoncado", Jaime);
        gitMatch.put("DustyMan", Dusty);

        gitPrint();

        userPrompt();

    }
}
