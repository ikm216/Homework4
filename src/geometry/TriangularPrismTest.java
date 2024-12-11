package geometry;

import org.junit.jupiter.api.Test;

public class TriangularPrismTest {
    @Test
	void test_should_return_created_TriangularPrism() {
		TriangularPrism _ = new TriangularPrism(3.0, 4.0, 10.0);
	}
	
	@Test
	void should_have_volume_one() {
		TriangularPrism prism = new TriangularPrism(3.0, 4.0, 10.0);
		assert(prism.volume() == 0.5 * 3.0 * 4.0 * 10.0);
	}
	
	@Test
	void should_calculate_surface_area() {
		TriangularPrism prism = new TriangularPrism(3.0, 4.0, 10.0);
        double baseArea = 0.5 * 3.0 * 4.0;
		assert(prism.surfaceArea() == (2 * baseArea) + 3 * (3.0 * 10.0));
	}
}
