import java.util.ArrayList;
import java.util.List;

class Movie {
    private final String title;
    private final List<Integer> ratings = new ArrayList<>();

    public Movie(String title) {
        this.title = title;
    }

    public void addRating(int rating) {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Rating must be between 1 and 5");
        }
        ratings.add(rating);
    }

    public double averageRating() {
        if (ratings.isEmpty()) return 0;
        int sum = 0;
        for (int rating : ratings) sum += rating;
        return (double) sum / ratings.size();
    }

    public void display() {
        System.out.printf("%s | Ratings: %d | Average: %.2f/5%n",
                title, ratings.size(), averageRating());
    }
}

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("The Example");
        movie.addRating(5);
        movie.addRating(4);
        movie.addRating(3);
        movie.display();
    }
}
