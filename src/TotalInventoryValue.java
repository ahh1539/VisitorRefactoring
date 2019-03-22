import java.util.List;

public class TotalInventoryValue implements Visitor {

    private double total = 0;

    public TotalInventoryValue(){

    }
    @Override
    public void visit(Book book) {
        total = total + (book.getPrice() * book.getQuantity());
    }

    @Override
    public void visit(Food food) {
        total = total + (food.getPrice() * food.getQuantity());
    }

    @Override
    public void visit(Movie movie) {total = total + ( movie.getPrice() * movie.getQuantity());}

//    @Override
//    public void visit(Product product) {
//        total = total + (product.getPrice() * product.getQuantity());
//    }

    @Override
    public void visit(Toy toy) {
        total = total + (toy.getPrice() * toy.getQuantity());
    }

    public void visit(Warehouse warehouse) { }

    public double getTotal() {
        return total;
    }
}
