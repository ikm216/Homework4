package geometry;

public class Circle extends Geometry2D{
    double rad;

    /**
     * Constructs a Circle with the specified radius.
     *
     * @param rad The radius of the circle.
     */
    public Circle(double rad) {
        this.rad = rad;
    }

    /**
     * Calculates the area of the circle.
     * The formula for the area of a circle is π * radius^2.
     *
     * @return The area of the circle.
     */
    @Override
    public double area(){
        return Math.PI * rad * rad;
    }

    /**
     * Calculates the perimeter (circumference) of the circle.
     * The formula for the perimeter of a circle is 2 * π * radius.
     *
     * @return The perimeter (circumference) of the circle.
     */
    @Override
    public double perimeter(){
        return 2 *Math.PI * rad;
    }

    @Override
    public String toString() {
        return "Circle [Radius: " + rad + "]";
    }
}
