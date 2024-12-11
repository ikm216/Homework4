package geometry;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CircleTest {
    @Test
    void test_should_return_created_circle(){
        Circle _ = new Circle(5.0);
    }
    @Test
    public void test_should_return_area_of_circle(){
        Circle circle = new Circle(5.0);
        assert(circle.area() == Math.PI * 5.0 * 5.0);
    }
    @Test
    public void test_should_return_perimeter_of_circle(){
        Circle circle = new Circle(5.0);
        assert(circle.perimeter() == 2 * Math.PI * 5.0);
    }
}
