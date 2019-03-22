import java.util.ArrayList;
import java.util.List;

public class BatteriesRequired implements Visitor {

    List<Toy> toys = new ArrayList<>();

    public BatteriesRequired(){}

    @Override
    public void visit(Book book) {

    }

    @Override
    public void visit(Food food) {

    }

    @Override
    public void visit(Movie movie) {

    }

    @Override
    public void visit(Toy toy) {
        if (toy.requiresBatteries()){
            toys.add(toy);
        }

    }

    @Override
    public void visit(Warehouse warehouse) {

    }

    public List<Toy> getToys() {
        return toys;
    }
}
