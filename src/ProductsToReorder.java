public class ProductsToReorder implements Visitor {

    public ProductsToReorder(){

    }

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

    @Override
    public Object visit(Warehouse warehouse) {
        return null;
    }
}
