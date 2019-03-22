import java.util.List;

public class MoviesByDirector implements Visitor {
    @Override
    public void visit(Book book){ }

    @Override
    public void visit(Food food) { }

    @Override
    public void visit(Movie movie) {

    }

//    @Override
//    public void visit(Product product){ }

    @Override
    public void visit(Toy toy) {}

    @Override
    public void visit(Warehouse warehouse) { }
}

