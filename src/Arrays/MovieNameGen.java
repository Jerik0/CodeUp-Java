package Arrays;

public class MovieNameGen {

    public String[] adjectives = {"Preposterous", "Succulent", "Horrible", "Voluptuous", "Pungent", "Pokey", "Dull", "Marvelous", "Gargantuan", "Gory", "The"};

    public String[] nouns = {"Hippos", "Olive Branch", "Gardener", "Triceratops", "Spy", "Tyrants", "Villains", "Fashion Models", "Cough Medicine", "Pickle"};

    public String[] firstName = {"Clive", "Arthur", "Mr.", "Jive", "Curly", "Moe", "Bo", "Bartholomew", "Chester", "Beatrix"};

    public String[] lastName = {"Squiggins", "Jangles", "Jiggy", "Babbles", "Strange", "Hawkins", "Knocking", "Parts", "Knobbins", "Barrymore"};

    public String[] category = {"Horror", "Suspense", "Comedy", "Musical", "Psychological Thriller", "Romance", "Indie", "Adventure", "Sci-Fi", "Documentary"};


    public String randomMovie() {
        String randomAdj;
        String randomNoun;
        int i = (int) Math.floor(Math.random() * adjectives.length);
        int j = (int) Math.floor(Math.random() * nouns.length);
        randomAdj = adjectives[i];
        randomNoun = nouns[j];
        String title = (randomAdj + " " + randomNoun);
        return title;
    }

    public String randomDirector() {
        String randomFirst;
        String randomLast;
        int i = (int) Math.floor(Math.random() * firstName.length);
        int j = (int) Math.floor(Math.random() * lastName.length);
        randomFirst = firstName[i];
        randomLast = lastName[j];
        return (randomFirst + " " + randomLast);
    }

    public String randomCategory() {
        String cat;
        int i = (int) Math.floor(Math.random() * category.length);
        cat = category[i];
        return cat;
    }
}
