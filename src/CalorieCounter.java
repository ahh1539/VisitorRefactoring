import java.util.ArrayList;
import java.util.List;

public class CalorieCounter implements Visitor{

    private int calories = 0;
    private List<Food> foods = new ArrayList<>();

    public CalorieCounter(){}

    @Override
    public void visit(Book book) {

    }

    @Override
    public void visit(Food food) {
        if (food.getCalories() <= calories){
            foods.add(food);
        }
    }

    @Override
    public void visit(Movie movie) {

    }

    @Override
    public void visit(Toy toy) {

    }

    @Override
    public void visit(Warehouse warehouse) {

    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public List<Food> getFoods() {
        return foods;
    }
}
