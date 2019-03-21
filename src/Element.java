import java.util.List;

public interface Element {

    Object accept(Visitor visitor);

}
