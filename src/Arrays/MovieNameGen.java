package Arrays;

public class MovieNameGen {

    public String[] adjectives = {"Preposterous", "Succulent", "Horrible", "Voluptuous", "Pungent", "Pokey", "Dull", "Marvelous", "Gargantuan", "Gory", "The", "Different", "Pure", "Impossible", "Consistently", "Impossibly", "Veritable", "The Unlikely", "The Traditional", "Basic", "Used", "Willing", "Large", "Electrical", "Bad", "Hardened", ""};

    public String[] nouns = {"Hippos", "Olive Branch", "Gardener", "Triceratops", "Spy", "Tyrants", "Villains", "Fashion Models", "Cough Medicine", "Pickle", "Baskets", "Variation", "Assistant", "Stranger", "Engineering", "Kings", "Gene", "Mud", "Potato", "Candidate", "Pie", "Me", "Uncle", "Bath", "Dysfunction", "Way", "Employment", "Death", "Situation", "Throat", "Dare"};

    public String[] firstName = {"Clive", "Arthur", "Mr.", "Jive", "Curly", "Moe", "Bo", "Bartholomew", "Chester", "Beatrix", "Ingrid", "Tyrion", "Morpheus", "Neo", "Bradley", "Brumhilde", "Ebert", "Dilbert", "Freida", "Humphrey", "Nigel", "Rupert"};

    public String[] lastName = {"Squiggins", "Jangles", "Jiggy", "Babbles", "Strange", "Hawkins", "Knocking", "Parts", "Knobbins", "Barrymore", "Swellington", "Swindler", "Sketch", "Twinkle", "Belchers", "Longbottom", "Potter", "Snape", "Stark", "Lannister"};

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
