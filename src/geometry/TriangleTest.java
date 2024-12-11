package geometry;

import org.junit.jupiter.api.Test;

public class TriangleTest {
    void test_should_return_created_triangle(){
        Triangle triangle = new Triangle(6.0, 8.0);
    }

    @Test
    public void test_should_return_area_of_rectangle(){
        Triangle triangle = new Triangle(6.0, 8.0);
        assert(triangle.area() == 0.5 * (6.0 * 8.0));
    }

    @Test
    public void test_should_return_perimeter_of_rectangle(){
        Triangle triangle = new Triangle(6.0, 8.0);
        assert(triangle.perimeter() == 3 * 6.0);
        
    }
}
