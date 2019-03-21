import java.util.List;

public class TotalInventoryValue implements Visitor {
    @Override
    public Object visit(Book book) {
        return null;
    }

    @Override
    public Object visit(Food food) {
        return null;
    }

    @Override
    public Object visit(Movie movie) {
        return null;
    }

    @Override
    public Object visit(Product product) {
        return null;
    }

    @Override
    public Object visit(Toy toy) {
        return null;
    }

    public Object visit(Warehouse warehouse) {
        double value = 0;
        for (Product p: warehouse.getInventory().values()){
            value = value + (p.getPrice() * p.getQuantity());
        }
        return value;
    }
}
