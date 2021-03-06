import java.util.List;
import java.util.ArrayList;

public class AreaAggregator implements SumProvider{
    private final List<HasArea> shapes = new ArrayList<>();

    public void addShape(HasArea shape) {
        shapes.add(shape);
    }

    public double sum() {
        double sum = 0;

        for (HasArea shape: shapes) {
            sum += shape.getArea();
        }

        return sum;
    }

}
