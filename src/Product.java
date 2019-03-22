import java.util.List;

/**
 * Class for a simple product.
 */
public class Product implements Element {
    private final String name;
    private final double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void adjustQuantity(int amount) {
        this.quantity += amount;
    }


    @Override
    public void accept(Visitor visitor) {

    }
}
