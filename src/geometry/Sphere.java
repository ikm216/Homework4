package geometry;

public class Sphere extends Geometry3D{
    double rad;

    public Sphere(double rad){
        this.rad = rad;
    }

    public double surfaceArea() {
        return 4 * Math.PI * rad * rad;
    }

    @Override
    public double volume() {
        return (4 / 3.0) * Math.PI * rad * rad * rad;
    }
}
