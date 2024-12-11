package geometry;

public class Triangle extends Geometry2D{
    double b;
    double h;

    /**
     * Constructs a Triangle with the specified base and height.
     *
     * @param b The base of the triangle.
     * @param h The height of the triangle.
     */
    public Triangle(double b, double h){
        this.b = b;
        this.h = h;
    }

    /**
     * Calculates and returns the area of the triangle.
     *
     * <p>The formula used is (0.5 * base * height).
     *
     * @return The area of the triangle.
     */
    @Override
    public double area() {
        return 0.5 * b * h;
    }

    /**
     * Calculates and returns the perimeter of the triangle.
     *
     * <p>Note: This method assumes the triangle is equilateral, 
     * so the formula used is 3 * base.
     *
     * @return The perimeter of the triangle.
     */
    @Override
    public double perimeter() {
        return 3 * b;
    }

    @Override
    public String toString() {
        return "Triangle [Base: " + b + ", Height: " + h + "]";
    }
}
