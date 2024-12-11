package geometry;

public class Rectangle extends Geometry2D {
    double len;
    double wid;

    /**
     * Constructs a Rectangle with the specified length and width.
     *
     * @param len The length of the rectangle.
     * @param wid The width of the rectangle.
     */
    public Rectangle(double len, double wid) {
        this.len = len;
        this.wid = wid;
    }

    /**
     * Calculates the area of the rectangle.
     * The formula for the area of a rectangle is length * width.
     *
     * @return The area of the rectangle.
     */
    @Override
    public double area() {
        return len * wid;
    }

    /**
     * Calculates the perimeter of the rectangle.
     * The formula for the perimeter of a rectangle is 2 * (length + width).
     *
     * @return The perimeter of the rectangle.
     */
    @Override
    public double perimeter() {
        return 2 * (len + wid);
    }

    @Override
    public String toString() {
        return "Rectangle [Length: " + len + ", Width: " + wid + "]";
    }

    
}
