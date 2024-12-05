import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    @Test
    void testArea() {
        Rectangle rectangle = new Rectangle(5, 10, new Color(255, 0, 0));
        assertEquals(50, rectangle.getArea());
    }

    @Test
    void testPerimeter() {
        Rectangle rectangle = new Rectangle(5, 10, new Color(0, 255, 0));
        assertEquals(30, rectangle.getPerimeter());
    }

    @Test
    void testZeroArea() {
        Rectangle rectangle = new Rectangle(0, 10, new Color(0, 0, 0));
        assertEquals(0, rectangle.getArea());
    }

    @Test
    void testNegativeSides() {
        Rectangle rectangle = new Rectangle(-5, -10, new Color(0, 0, 0));
        assertEquals(50, rectangle.getArea(), "Pole powinno być dodatnie mimo ujemnych długości.");
        assertEquals(-30, rectangle.getPerimeter(), "Obwód może być ujemny dla ujemnych boków.");
    }
}