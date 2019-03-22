import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A warehouse of products.
 */
public class Warehouse implements Element {
    private Map<String, Product> inventory;

    private TotalInventoryValue totalVisitor = new TotalInventoryValue();
    private ProductsToReorder reorderVisitor = new ProductsToReorder();
    private ToysSuitableForAge toyVisitor = new ToysSuitableForAge();

    public Warehouse() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getName(), product);
    }

    // product queries

    public double getTotalInventoryValue() {
        for(Product product : inventory.values()) {
            product.accept(totalVisitor);
        }
        return totalVisitor.getTotal();
    }

    public List<Product> getProductsToReorder() {

        for(Product product : inventory.values()) {
            if(product.getQuantity() < 5) {
                product.accept(reorderVisitor);

            }
        }
        return reorderVisitor.getReorders();
    }


    public List<Movie> getMoviesByDirector(String director) {

        List<Movie> movies = new ArrayList<>();

        for(Product product : inventory.values()) {
            if(product instanceof Movie) {
                Movie movie = (Movie)product;
                if(movie.getDirector().equals(director)) {
                    movies.add(movie);
                }
            }
        }
        return movies;
    }


    public List<Toy> getToysSuitableForAge(int age) {

        for(Product product : inventory.values()) {
            toyVisitor.setAge(age);
            product.accept(toyVisitor);

        }

        return toyVisitor.getToys();
    }

    public Map<String, Product> getInventory() {
        return inventory;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


}
