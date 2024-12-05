import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest {
    static class TestShape extends Shape {
        public TestShape(Color color) {
            super(color);
        }

        @Override
        double getArea() {
            return 0;
        }

        @Override
        double getPerimeter() {
            return 0;
        }
    }

    @Test
    void testGetColorDescription_withValidColor() {
        Color color = new Color(255, 100, 50, 200);
        Shape shape = new TestShape(color);

        String expectedDescription = "Red: 255, Green: 100, Blue: 50, Alpha: 200";
        assertEquals(expectedDescription, shape.getColorDescription(), "Opis koloru powinien być zgodny z oczekiwanym formatem.");
    }

    @Test
    void testGetColorDescription_withBoundaryValues() {
        Color color = new Color(0, 0, 0, 0);
        Shape shape = new TestShape(color);

        String expectedDescription = "Red: 0, Green: 0, Blue: 0, Alpha: 0";
        assertEquals(expectedDescription, shape.getColorDescription(), "Opis koloru powinien być poprawny dla minimalnych wartości.");
        
        color = new Color(255, 255, 255, 255);
        shape = new TestShape(color);
        
        expectedDescription = "Red: 255, Green: 255, Blue: 255, Alpha: 255";
        assertEquals(expectedDescription, shape.getColorDescription(), "Opis koloru powinien być poprawny dla maksymalnych wartości.");
    }

    @Test
    void testGetColorDescription_withMixedValues() {
        Color color = new Color(123, 45, 67, 89);
        Shape shape = new TestShape(color);
        
        String expectedDescription = "Red: 123, Green: 45, Blue: 67, Alpha: 89";
        assertEquals(expectedDescription, shape.getColorDescription(), "Opis koloru powinien być zgodny z mieszanymi wartościami.");
    }

    @Test
    void testInvalidShapeColor() {
        Shape shape = new TestShape(null);
        assertEquals("Red: 0, Green: 0, Blue: 0, Alpha: 0", shape.getColorDescription());
    }
}