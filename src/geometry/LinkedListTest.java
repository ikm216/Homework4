package geometry;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LinkedListTest {
    
    @Test
    void test_should_add_and_store() {
        Linked_List<Geometry2D> link_list = new Linked_List<>();
        Rectangle rect = new Rectangle(5.0, 4.0);
        Circle circle = new Circle(5.0);

        link_list.add(rect);
        link_list.add(circle);

        assertEquals(2, link_list.size(), "Linked list size should be 2 after adding two elements.");
        assertEquals(rect, link_list.find(0), "First element should be the rectangle.");
        assertEquals(circle, link_list.find(1), "Second element should be the circle.");
    }

    @Test
    void test_should_remove_element() {
        Linked_List<Geometry2D> link_list = new Linked_List<>();
        Rectangle rect = new Rectangle(5.0, 4.0);
        link_list.add(rect);

        boolean removed = link_list.remove(rect);
        assertEquals(0, link_list.size(), "Linked list size should be 0 after removing the element.");
        assertEquals(true, removed, "Rectangle should be removed successfully.");
    }
}
