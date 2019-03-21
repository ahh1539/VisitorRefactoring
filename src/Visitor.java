import java.util.List;

public interface Visitor {

    Object visit(Book book);

    Object visit(Food food);

    Object visit(Movie movie);

    Object visit(Product product);

    Object visit(Toy toy);

    Object visit(Warehouse warehouse);
}
