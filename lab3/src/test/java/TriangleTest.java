import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    @Test
    void testArea() {
        Triangle triangle = new Triangle(3, 4, 5, 6, new Color(0, 0, 255));
        assertEquals(9, triangle.getArea());
    }

    @Test
    void testPerimeter() {
        Triangle triangle = new Triangle(3, 4, 5, 6, new Color(255, 255, 0));
        assertEquals(12, triangle.getPerimeter());
    }

    @Test
    void testZeroOrNegativeSides() {
        Triangle triangle = new Triangle(0, 0, 0, 0, new Color(255, 0, 0));
        assertEquals(0, triangle.getArea());
        assertEquals(0, triangle.getPerimeter());

        triangle = new Triangle(-3, -4, -5, -6, new Color(0, 255, 0));
        assertEquals(-12, triangle.getPerimeter(), "Obwód powinien uwzględniać ujemne długości.");
    }
}