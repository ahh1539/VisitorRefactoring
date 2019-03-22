import java.util.ArrayList;
import java.util.List;

public class ProductsToReorder implements Visitor {

    private List<Product> reorders = new ArrayList<>();

    public ProductsToReorder(){ }

    @Override
    public void visit(Book book){ reorders.add(book);}

    @Override
    public void visit(Food food) { reorders.add(food);}

    @Override
    public void visit(Movie movie) { reorders.add(movie);}

    @Override
    public void visit(Toy toy) { reorders.add(toy);}

    @Override
    public void visit(Warehouse warehouse) { }

    public List<Product> getReorders() {
        return reorders;
    }
}
