package geometry;

import java.util.LinkedList;

/**
 * A generic Linked List implementation for storing geometric objects.
 *
 * @param <T> The type of objects to store in the linked list.
 */
public class Linked_List<T> {
    private LinkedList<T> link_list;

    /**
     * Constructor to initialize the linked list.
     */
    public Linked_List() {
        link_list = new LinkedList<>();
    }

    /**
     * Adds an object to the linked list.
     *
     * @param geometry The object to add.
     */
    public void add(T geometry) {
        link_list.add(geometry);
    }

    /**
     * Removes an object from the linked list.
     *
     * @param geometry The object to remove.
     * @return true if the object was successfully removed, false otherwise.
     */
    public boolean remove(T geometry) {
        return link_list.remove(geometry);
    }

    /**
     * Retrieves an object from the linked list by its index.
     *
     * @param index The index of the object to retrieve.
     * @return The object at the specified index, or null if the index is invalid.
     */
    public T find(int index) {
        if (index >= 0 && index < link_list.size()) {
            return link_list.get(index);
        }
        return null;
    }

    /**
     * Displays all objects in the linked list.
     */
    public void displayAll() {
        for (T geometry : link_list) {
            System.out.println(geometry);
        }
    }

    /**
     * Returns the size of the linked list.
     *
     * @return The number of elements in the linked list.
     */
    public int size() {
        return link_list.size();
    }
}
