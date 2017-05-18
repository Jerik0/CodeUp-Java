package Arrays;

public class MoviesArray {

    static MovieNameGen generator = new MovieNameGen();
    public static Movie[] findAll() {
        return new Movie[]{
            new Movie(generator.randomMovie(), generator.randomCategory(), generator.randomDirector()),
            new Movie(generator.randomMovie(), generator.randomCategory(), generator.randomDirector()),
            new Movie(generator.randomMovie(), generator.randomCategory(), generator.randomDirector()),
            new Movie(generator.randomMovie(), generator.randomCategory(), generator.randomDirector()),
            new Movie(generator.randomMovie(), generator.randomCategory(), generator.randomDirector()),
            new Movie(generator.randomMovie(), generator.randomCategory(), generator.randomDirector()),
            new Movie(generator.randomMovie(), generator.randomCategory(), generator.randomDirector()),
            new Movie(generator.randomMovie(), generator.randomCategory(), generator.randomDirector()),
            new Movie(generator.randomMovie(), generator.randomCategory(), generator.randomDirector()),
            new Movie(generator.randomMovie(), generator.randomCategory(), generator.randomDirector()),
            new Movie(generator.randomMovie(), generator.randomCategory(), generator.randomDirector()),
            new Movie(generator.randomMovie(), generator.randomCategory(), generator.randomDirector()),
            new Movie(generator.randomMovie(), generator.randomCategory(), generator.randomDirector()),
            new Movie(generator.randomMovie(), generator.randomCategory(), generator.randomDirector()),
            new Movie(generator.randomMovie(), generator.randomCategory(), generator.randomDirector()),
            new Movie(generator.randomMovie(), generator.randomCategory(), generator.randomDirector()),
            new Movie(generator.randomMovie(), generator.randomCategory(), generator.randomDirector()),
            new Movie(generator.randomMovie(), generator.randomCategory(), generator.randomDirector()),
            new Movie(generator.randomMovie(), generator.randomCategory(), generator.randomDirector()),
            new Movie(generator.randomMovie(), generator.randomCategory(), generator.randomDirector()),
            new Movie(generator.randomMovie(), generator.randomCategory(), generator.randomDirector()),


        };
    }
}
