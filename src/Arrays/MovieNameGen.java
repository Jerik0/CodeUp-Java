package Arrays;

import java.util.Random;

public class MovieNameGen {

    static String[] adjectives = {"Preposterous", "Succulent", "Horrible", "Voluptuous", "Pungent", "Pokey", "Dull", "Marvelous", "Gargantuan", "Gory", "The"};

    static String[] nouns = {"Hippos", "Olive Branch", "Gardener", "Triceratops", "Spy", "Tyrants", "Villains", "Fashion Models", "Cough Medicine", "Pickle"};


    public static String Randomize() {
        String randomAdj;
        String randomNoun;
        int i = (int) Math.floor(Math.random() * adjectives.length);
        int j = (int) Math.floor(Math.random() * nouns.length);
        randomAdj = adjectives[i];
        randomNoun = nouns[j];
        String title = (randomAdj + " " + randomNoun);
        return title;
    }

    public static void main(String[] args) {

        System.out.println("Your Random Movie name is: " + Randomize());

    }


}
