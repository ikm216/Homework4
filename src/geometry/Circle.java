package geometry;

public class Circle extends Geometry2D{
    double rad;

    public Circle(double rad) {
        this.rad = rad;
    }

    @Override
    public double area(){
        return Math.PI * rad * rad;
    }

    @Override
    public double perimeter(){
        return 2 *Math.PI * rad;
    }
}
