public class Movie {
    private String title;
    private String genre;

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }
    public void displayDetails() {
        System.out.println("Movie Title: " + title);
        System.out.println("Genre: " + genre);
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public static void main(String[] args) {
        // Create a Movie object
        Movie movie = new Movie("Inception", "Science Fiction");

        movie.displayDetails();
    }
}
