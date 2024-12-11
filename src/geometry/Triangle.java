package geometry;

public class Triangle extends Geometry2D{
    double b;
    double h;

    public Triangle(double b, double h){
        this.b = b;
        this.h = h;
    }

    @Override
    public double area() {
        return 0.5 * b * h;
    }

    public double perimeter() {
        return 3 * b;
    }
}
