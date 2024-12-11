package geometry;

public class TriangularPrism extends Geometry3D{
    double b;
    double h;
    double len;

    
    public TriangularPrism(double b, double h, double len) {
        this.b = b;
        this.h = h;
        this.len = len;
    }

    @Override
    public double surfaceArea() {
        double baseArea = 0.5 * b * h;
        return 2 * baseArea + 3 * (b * len);
    }

    @Override
    public double volume() {
        return 0.5 * b * h * len;
    }
}
