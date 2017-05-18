package Arrays;

import InputStuff.Input;
import java.io.*;

public class MoviesApplication {

    static PrintStream print = System.out;
    static MovieNameGen generator = new MovieNameGen();
    static Input userInput = new Input();

    public static void main(String[] args) {

        Movie[] movieFinder = MoviesArray.findAll();

        String[] options = {"exit", "view all movies", "horror movies", "suspense", "comedy", "musical", "psychological thriller", "romance", "indie", "adventure", "sci-fi", "documentary"};

        int[] optionNumbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        for (int i = 0; i < optionNumbers.length; i++) {
            System.out.printf("%d --  %s \n", optionNumbers[i], options[i]);
        }

        switch (userInput.getString()) {
            case "0": {
                System.exit(0);
            }
            break;
            case "1": {
                for (Movie movie : movieFinder) {
                    print.println(movie.getInfo());
                }
            }
            break;
            case "2": {
                for (Movie movie : movieFinder) {
                    if (movie.getCategory().equals("Horror")) {
                        print.println(movie.getInfo());
                    }
                }
            }
            break;
            case "3": {
                for (Movie movie : movieFinder) {
                    if (movie.getCategory().equals("Suspense")) {
                        print.println(movie.getInfo());
                    }
                }
            }
            break;
            case "4": {
                for (Movie movie : movieFinder) {
                    if (movie.getCategory().equals("Comedy")) {
                        print.println(movie.getInfo());
                    }
                }
            }
            break;
            case "5": {
                for (Movie movie : movieFinder) {
                    if (movie.getCategory().equals("Musical")) {
                        print.println(movie.getInfo());
                    }
                }
            }
            break;
            case "6": {
                for (Movie movie : movieFinder) {
                    if (movie.getCategory().equals("Psychological Thriller")) {
                        print.println(movie.getInfo());
                    }
                }
            }
            break;
            case "7": {
                for (Movie movie : movieFinder) {
                    if (movie.getCategory().equals("Romance")) {
                        print.println(movie.getInfo());
                    }
                }
            }
            break;
            case "8": {
                for (Movie movie : movieFinder) {
                    if (movie.getCategory().equals("Indie")) {
                        print.println(movie.getInfo());
                    }
                }
            }
            break;
            case "9": {
                for (Movie movie : movieFinder) {
                    if (movie.getCategory().equals("Adventure")) {
                        print.println(movie.getInfo());
                    }
                }
            }
            break;
            case "10": {
                for (Movie movie : movieFinder) {
                    if (movie.getCategory().equals("Sci-Fi")) {
                        print.println(movie.getInfo());
                    }
                }
            }
            break;
            case "11": {
                for (Movie movie : movieFinder) {
                    if (movie.getCategory().equals("Documentary")) {
                        print.println(movie.getInfo());
                    }
                }
                break;
            }
        }
    }
}
