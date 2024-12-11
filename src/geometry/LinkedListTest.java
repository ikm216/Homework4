package geometry;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LinkedListTest {
    
    @Test
    void test_should_add_and_store(){
        LinkedList<Geometry2D> link_list = new LinkedList<>();
        Rectangle rect = new Rectangle(5.0, 4.0);
        Circle circle = new Circle(5.0);
        link_list.add(rect);
        link_list.add(circle);




        assertEquals(2, link_list.size());
        assertEquals(rect, link_list.get(0));
        assertEquals(circle, link_list.get(1));
    }
    @Test
    void test_should_return_delete(){
        LinkedList<Geometry2D> link_list = new LinkedList<>();
        Rectangle rect = new Rectangle(5.0, 4.0);
        link_list.add(rect);

        link_list.remove(rect);
        assertEquals(0, link_list.size());
    }
}
