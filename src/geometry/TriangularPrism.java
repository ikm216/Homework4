package geometry;

public class TriangularPrism extends Geometry3D{
    double b;
    double h;
    double len;

    /**
     * Constructor to create a TriangularPrism object.
     *
     * @param b   The base of the triangular prism.
     * @param h   The height of the triangular prism.
     * @param len The length of the triangular prism.
     */
    public TriangularPrism(double b, double h, double len) {
        this.b = b;
        this.h = h;
        this.len = len;
    }

    /**
     * Calculates the surface area of the triangular prism.
     * 
     * The formula used:
     * Surface Area = 2 * (0.5 * base * height) + Perimeter of base * length
     *
     * @return The surface area of the triangular prism.
     */
    @Override
    public double surfaceArea() {
        double baseArea = 0.5 * b * h;
        return 2 * baseArea + 3 * (b * len);
    }

    /**
     * Calculates the volume of the triangular prism.
     *
     * The formula used:
     * Volume = 0.5 * base * height * length
     *
     * @return The volume of the triangular prism.
     */
    @Override
    public double volume() {
        return 0.5 * b * h * len;
    }
}
