import java.util.List;

public interface Visitor {

    void visit(Book book);

    void visit(Food food);

    void visit(Movie movie);

    void visit(Toy toy);

    void visit(Warehouse warehouse);
}
