package geometry;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    
    @Test
    void test_should_return_created_rectangle(){
        Rectangle _ = new Rectangle(5.0, 4.0);
    }

    @Test
    public void test_should_return_area_of_rectangle(){
        Rectangle rect = new Rectangle(5.0, 4.0);
        assert(rect.area() == 5.0 * 4.0);
    }

    @Test
    public void test_should_return_perimeter_of_rectangle(){
        Rectangle rect = new Rectangle(5.0, 4.0);
        assert(rect.perimeter() == 2 * (5.0 + 4.0));
        
    }
}


