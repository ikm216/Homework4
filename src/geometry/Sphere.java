package geometry;

public class Sphere extends Geometry3D{
    double rad;

    /**
     * Constructor to create a Sphere object.
     *
     * @param rad The radius of the sphere.
     */
    public Sphere(double rad){
        this.rad = rad;
    }

    /**
     * Calculates the surface area of the sphere.
     *
     * @return The surface area of the sphere.
     */
    public double surfaceArea() {
        return 4 * Math.PI * rad * rad;
    }

    /**
     * Calculates the volume of the sphere.
     *
     * @return The volume of the sphere.
     */
    @Override
    public double volume() {
        return (4 / 3.0) * Math.PI * rad * rad * rad;
    }

    @Override
    public String toString() {
        return "Sphere [Radius: " + rad + "]";
    }
}
