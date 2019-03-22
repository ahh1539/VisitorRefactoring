import java.util.ArrayList;
import java.util.List;

public class MoviesByDirector implements Visitor {

    private String director = "";
    List<Movie> movies = new ArrayList<>();

    public MoviesByDirector(){}
    @Override
    public void visit(Book book){ }

    @Override
    public void visit(Food food) { }

    @Override
    public void visit(Movie movie) {
        if(movie.getDirector().equals(director)) {
            movies.add(movie);
        }
    }

    @Override
    public void visit(Toy toy) {}

    @Override
    public void visit(Warehouse warehouse) { }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<Movie> getMovies() {
        return movies;
    }
}

