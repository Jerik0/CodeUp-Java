package Arrays;

public class Movie {

    private String name;
    private String category;
    private String director;

    public Movie(String name, String cat, String direct) {
        this.name = name;
        this.category = cat;
        this.director = direct;
    }

    public String getInfo() {
        String results;
        results = ("Category: " + category + "\nTitle: " + name + "\nDirected By: " + director);
        return results;
    }

    public String getCategory() {
        return category;
    }
}
