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
    private MoviesByDirector moviesByDirectorVisitor = new MoviesByDirector();
    private BatteriesRequired batteriesRequiredVisitor = new BatteriesRequired();
    private CalorieCounter calorieCounterVisitor = new CalorieCounter();

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
        moviesByDirectorVisitor.setDirector(director);
        for(Product product : inventory.values()) {
            product.accept(moviesByDirectorVisitor);
        }
        return moviesByDirectorVisitor.getMovies();
    }


    public List<Toy> getToysSuitableForAge(int age) {

        for(Product product : inventory.values()) {
            toyVisitor.setAge(age);
            product.accept(toyVisitor);

        }

        return toyVisitor.getToys();
    }

    public List<Toy> requiresBatteries(){
        for(Product product : inventory.values()) {
            product.accept(batteriesRequiredVisitor);
        }
        return batteriesRequiredVisitor.getToys();
    }


    public List<Food> noFatty(int calories){
        calorieCounterVisitor.setCalories(calories);
        for(Product product : inventory.values()) {
            product.accept(calorieCounterVisitor);
        }
        return calorieCounterVisitor.getFoods();
    }

    public Map<String, Product> getInventory() {
        return inventory;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


}
