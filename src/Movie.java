import java.util.ArrayList;

public class Movie extends Media{

    private int duration;

    public Movie(int duration) {
        this.duration = duration;
    }

    public Movie(String title, String author, String ISBN, double price, int duration) {
        super(title, author, ISBN, price);
        this.duration = duration;
    }

    public void watch(User user) {

        user.directPurchaseMedia(this);
        System.out.println(user.getName()+ " is watching  " + this.getTitle());
    }

    public ArrayList<Movie> recommendSimilarMovies(ArrayList<Movie> movieCatalog){

        ArrayList<Movie> movies = new ArrayList<>();
        for (Movie movie : movieCatalog) {
            if(this.getAuthor().equals(movie.getAuthor())){
                movies.add(movie);
            }
        }
        return movies;
    }

    @Override
    public String toString(){
        return super.toString() + "\nDuration: " + duration;
    }


    @Override
    public String getMediaType() {
        if(this.getDuration()>120)
            return "Long Movie";
        else
            return "Movie";
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
