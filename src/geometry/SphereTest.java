package geometry;

import org.junit.jupiter.api.Test;

public class SphereTest {
    @Test
    void test_should_return_created_sphere(){
        Sphere _ = new Sphere(5.0);
    }

    @Test
    public void test_should_return_surface_area_of_sphere(){
        Sphere sphere = new Sphere(5.0);
        assert(sphere.surfaceArea() == 4 * Math.PI * Math.pow(5.0, 2));
    }

    @Test
    public void test_should_return_volume_of_sphere(){
        Sphere sphere = new Sphere(5.0);
        assert(sphere.volume() == (4.0 / 3.0) * Math.PI * Math.pow(5.0, 3));
        
    }
}
