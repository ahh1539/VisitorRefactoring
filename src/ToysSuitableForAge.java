import java.util.ArrayList;
import java.util.List;

public class ToysSuitableForAge implements Visitor {

    int age = 0;
    List<Toy> toys = new ArrayList<>();

    ToysSuitableForAge(){

    }

    @Override
    public void visit(Book book){ }

    @Override
    public void visit(Food food) { }

    @Override
    public void visit(Movie movie) { }

//    @Override
//    public void visit(Product product){
//        if (product instanceof Toy){
//            Toy toy = (Toy) product;
//            visit(toy);
//        }
//    }

    @Override
    public void visit(Toy toy) {
        if(toy.getMinimumAge() >= age) {
            toys.add(toy);
        }
    }

    @Override
    public void visit(Warehouse warehouse) { }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Toy> getToys() {
        return toys;
    }
}
