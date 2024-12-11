package geometry;

public class Rectangle extends Geometry2D {
    double len;
    double wid;

    public Rectangle(double len, double wid) {
        this.len = len;
        this.wid = wid;
    }

    @Override
    public double area() {
        return len * wid;
    }

    @Override
    public double perimeter() {
        return 2 * (len + wid);
    }
}
